/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



/**
 *
 * @author Edmundo Dela Cruz
 */
public class stackSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList ll = new LinkedList();
        Queue<String> q = new LinkedList();
        
        Stack stack = new Stack();
        stack.add("Ed");
        stack.add(123);
        stack.add(true);
        
        System.out.println("Stack 1 "+stack);
        
//        Stack stack1 = new Stack();
//        stack1.add("Test");
//        stack1.add(123);

        Stack stack1 = new Stack();
        stack1.push("Ed");
        stack1.push(123);
        stack1.push(true);
        
        System.out.println("Stack 2 "+stack1);
        
        
        System.out.println("Peek element is " +stack1.peek());
        
        System.out.println("Stack 3 "+stack1);
        
//        System.out.println("Pop element is " +stack1.pop());
        
        System.out.println("Stack 4 "+stack1);
        
//        stack1.clear();

        System.out.println(stack1.empty());
        
        
        System.out.println("Search element "+stack1.search("Ed1"));
        
      
    }
    
}
