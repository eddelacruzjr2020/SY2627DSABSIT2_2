package Week13to14;

/*
 * A sample Java program demonstrating Depth-First Search (DFS)
 * DFS explores a graph by going as deep as possible along each path
 * before backtracking.
 */

import java.util.*;

public class DFSTraversal {

    private LinkedList<Integer> adj[];   // Adjacency list to store graph structure
    private boolean visited[];           // Tracks whether a vertex has been visited

    /* Graph constructor
     * V = number of vertices
     * This initializes the adjacency list and visited array
     */
    DFSTraversal(int V)
    {
        adj = new LinkedList[V];     // Create array of linked lists
        visited = new boolean[V];    // Initialize visited status for each vertex

        // Initialize each index of adjacency list as a new LinkedList
        for (int i = 0; i < V; i++)
            adj[i] = new LinkedList<Integer>();
    }

    /* Adds a directed edge from src → dest
     * You may treat this as an arrow pointing from src to dest
     */
    void insertEdge(int src, int dest) {
        adj[src].add(dest);
    }

    /*
     * DFS Traversal (recursive)
     * 1. Mark the current node as visited.
     * 2. Process/print the node.
     * 3. Visit all adjacent unvisited nodes (recursive call).
     * This goes "deep" into a path before returning and exploring others.
     */
    void DFS(int vertex)
    {
        visited[vertex] = true;          // Mark current node as visited
        System.out.print(vertex + " ");  // Print or process the current node

        // Use iterator to visit all neighbors of the current vertex
        Iterator<Integer> it = adj[vertex].listIterator();

        // Explore each adjacent node
        while (it.hasNext()) {
            int n = it.next();

            // Only recurse into unvisited nodes
            if (!visited[n])
                DFS(n);    // Recursive call: dive deeper
        }
    }

    public static void main(String args[])
    {
        // Create a graph with 8 vertices (0 to 7)
        DFSTraversal graph = new DFSTraversal(8);

        /*
         * Insert edges into the graph
         * This defines which nodes connect to which nodes
         */
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(0, 3);
        graph.insertEdge(1, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 5);
        graph.insertEdge(3, 6);
        graph.insertEdge(4, 7);
        graph.insertEdge(4, 5);
        graph.insertEdge(5, 2);

        System.out.println("Depth First Traversal for the graph is:");

        // Perform DFS starting at vertex 0
        graph.DFS(1);
    }
}
