/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week7and8;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class QueueSampleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Queue q1 = new ArrayBlockingQueue(3);
//        System.out.println("Customer add "+q1.add("Ed"));
//        System.out.println("Customer add "+q1.add("DC"));
//        System.out.println("Customer add "+q1.add("Test"));
//        
//        
//        System.out.println("Customer add "+q1.add("Test"));
//        
        
        Queue q2 = new ArrayBlockingQueue(3);
        System.out.println("Customer add "+q2.offer("Ed"));
        System.out.println("Customer add "+q2.offer("DC"));
        System.out.println("Customer add "+q2.offer("Test"));
        
        
        System.out.println("Customer add "+q2.offer("Test"));
        
    }
    
}
