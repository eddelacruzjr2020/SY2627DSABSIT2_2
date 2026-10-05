/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week6;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class queueSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue q = new PriorityBlockingQueue();
        q.add("Ed");
        q.add(123);
        q.add(true);
        q.add("Ed");
        q.add(null);
        
        System.out.println("Queue is "+q);
//        q.clear();
//        System.out.println("Remove element "+q.remove());
//        
//        System.out.println("Queue 1 is "+q);
        
//        while(!q.isEmpty()){
//            System.out.println(q.poll());
//        }
        
        
//        
//        Queue q1 = new LinkedList();
//        q1.add("Ed");
//        q1.add(123);
//        q1.add(true);
//        q1.add("Ed");
//        
//        System.out.println("Queue is "+q1);
//        q1.clear();
//        
//        System.out.println("Remove element "+q1.poll());
//        
//        System.out.println("Queue 1 is "+q1);
//        
    }
    
}
