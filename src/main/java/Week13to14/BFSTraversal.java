    package Week13to14;

import java.util.*;

// This class demonstrates Breadth-First Search (BFS) on a directed graph.
// BFS is used to traverse a graph level-by-level using a queue.
public class BFSTraversal    
{
    private int vertex;                 // Total number of vertices in the graph
    private LinkedList<Integer> adj[];  // Adjacency list representation of the graph
    private Queue<Integer> que;         // Queue used for BFS traversal

    // Constructor: initializes the graph based on the number of vertices
    BFSTraversal(int v)
    {
        vertex = v;

        // Creating an array of LinkedLists to store adjacency information
        adj = new LinkedList[vertex];

        // Initialize each index with an empty LinkedList
        for (int i = 0; i < v; i++)
        {
            adj[i] = new LinkedList<>();
        }

        // Queue implementation using LinkedList
        que = new LinkedList<Integer>();
    }

    // Method to insert an edge into the graph
    void insertEdge(int v, int w)
    {
        // Add node w to the adjacency list of v
        // This means there is a directed edge from v → w
        adj[v].add(w);

        // Note: This example uses directed edges. 
        // For undirected graphs, we would also add adj[w].add(v);
    }

    // BFS traversal starting from a given node `n`
    void BFS(int n)
    {
        // Boolean array to track which nodes have been visited
        boolean nodes[] = new boolean[vertex];

        int a = 0;

        // Mark the starting node as visited
        nodes[n] = true;

        // Add the starting node to the queue
        que.add(n);

        // Continue until queue becomes empty (means traversal is complete)
        while (que.size() != 0)
        {
            // Remove the current node from queue (FIFO)
            n = que.poll();

            // Print the current node — this is the BFS order
            System.out.print(n + " ");

            // Loop through all adjacent vertices of node n
            for (int i = 0; i < adj[n].size(); i++)
            {
                a = adj[n].get(i);  // Get neighboring vertex

                // Only visit unvisited neighbors
                if (!nodes[a])
                {
                    nodes[a] = true;  // Mark as visited
                    que.add(a);       // Add to queue for future exploration
                }
            }
        }
    }

    public static void main(String args[])
    {
        // Create a graph with 10 vertices (0–9)
        BFSTraversal graph = new BFSTraversal(10);

        // Insert edges into the graph
        // These define the connectivity between nodes
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
        graph.insertEdge(6, 5);
        graph.insertEdge(7, 5);
        graph.insertEdge(7, 8);

        System.out.println("Breadth First Traversal for the graph is:");

        // Start BFS at node 0
        graph.BFS(6);
    }
}
