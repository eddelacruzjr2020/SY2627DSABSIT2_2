package Week13to14;

import java.util.Arrays;

/*
 * This class implements a Max Heap data structure.
 * A Max Heap always maintains the largest value at the root (index 0).
 * Every parent node is always greater than or equal to its children.
 *
 * Heap is implemented using an array, where:
 *  - Parent of index i  = (i - 1) / 2
 *  - Left child        = 2*i + 1
 *  - Right child       = 2*i + 2
 */

public class MaxHeap {

    private int[] heap;  // Array representation of the heap
    private int size;    // Number of elements currently stored

    // Constructor: creates an empty heap with a fixed capacity
    public MaxHeap(int capacity) {
        heap = new int[capacity];
    }

    /*
     * Insert a value into the heap.
     * Steps:
     *  1. Place the new value at the next available index
     *  2. "Bubble up" (fixUp) to restore heap property
     */
    public void insert(int value) {
        if (isFull()) {
            throw new IllegalStateException("Heap is full");
        }

        heap[size] = value;   // Place value at the bottom
        fixUp(size);          // Restore max-heap property
        size++;               // Increase number of elements
    }

    /*
     * Deletes the root element (largest value) from the heap.
     * Steps:
     *  1. Save the root value to return later
     *  2. Move last element to the root
     *  3. Reduce heap size
     *  4. "Bubble down" (fixDown) to restore heap property
     */
    public int delete() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int value = heap[0];             // Largest value (root)
        heap[0] = heap[size - 1];        // Move last value to root
        size--;
        fixDown(0);                      // Restore heap property

        return value;
    }

    /*
     * fixUp: Moves a value up the heap until the heap property is restored.
     * This happens when a child is larger than its parent.
     */
    private void fixUp(int index) {
        int parent = (index - 1) / 2;

        // Continue swapping while parent is smaller than child
        while (parent >= 0 && heap[parent] < heap[index]) {
            int temp = heap[parent];
            heap[parent] = heap[index];
            heap[index] = temp;

            index = parent;                  // Move up to parent's index
            parent = (index - 1) / 2;        // Recalculate parent
        }
    }

    /*
     * fixDown: Pushes a value downward until heap property is restored.
     * Used when the root has been replaced after deletion.
     */
    private void fixDown(int index) {
        int left = 2 * index + 1;   // Left child index
        int right = 2 * index + 2;  // Right child index
        int largest = index;        // Assume current index is largest

        // Compare with left child
        if (left < size && heap[left] > heap[index]) {
            largest = left;
        }

        // Compare with right child
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        // If a child is larger, swap and continue fixing
        if (index != largest) {
            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;

            fixDown(largest);   // Recursively fix down the child position
        }
    }

    // Utility methods
    public boolean isFull() {
        return size == heap.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Print the underlying heap array (not necessarily sorted)
    public void print() {
        System.out.println(Arrays.toString(heap));
    }

    // Test the MaxHeap implementation
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);

        // Insert values into heap
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(30);
        maxHeap.insert(5);

        maxHeap.print();     // Display heap array

        maxHeap.delete();    // Remove largest element (root)
        
        maxHeap.print();     // Display updated heap array
    }
}
