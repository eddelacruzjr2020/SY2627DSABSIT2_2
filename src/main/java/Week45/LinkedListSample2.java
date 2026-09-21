/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week45;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class LinkedListSample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Collection<Integer> collect = new ArrayList<>();
        collect.add(123); //[123]
        collect.add(456); //[123, 456]
        collect.add(789); //[123, 456, 789]
        
        LinkedList ll = new LinkedList<>(collect);
        ll.add("DSA"); //[123, 456, 789, DSA]
        ll.add("FUN"); //[123, 456, 789, DSA, FUN]
        ll.add(1, "IS"); //[123, ,IS, 456, 789, DSA, FUN]
        System.out.println("Week45.LinkedListSample2.main()"); ////[123, ,IS, 456, 789, DSA, FUN]
        
        LinkedList ll2 = new LinkedList();
        ll2.add(1);
        ll2.add(2);
        ll2.add(3); //[1, 2, 3]
        
        ll2.addAll(1, ll); //[1, 123, ,IS, 456, 789, DSA, FUN, 2, 3]
        
        System.out.println("LinkedList 2 "+ll2);
        
        ll2.addFirst("First");
        System.out.println("LinkedList 3 "+ll2);
        
//        ll2.clear();
//        System.out.println("LinkedList 4 "+ll2);

        System.out.println(ll2.clone());
        
        System.out.println(ll2.contains("DSA"));
        
        System.out.println(ll2.get(7));
        
        System.out.println("Get First "+ll2.getFirst());
        
        System.out.println("Get Last "+ll2.getLast());
        
         System.out.println("Index of "+ll2.indexOf("fun"));
         
         ll2.offer("Last");
         System.out.println("Linkedlist 4 "+ll2);
         
//         ll2.clear();
         System.out.println("Peek value is "+ll2.peek());
         System.out.println("Linkedlist 5 "+ll2);
         
         System.out.println("Poll value is "+ll2.poll());
         System.out.println("Linkedlist 6 "+ll2);
         
         System.out.println("Pop value is "+ll2.pop());
         System.out.println("Linkedlist 7 "+ll2);
         
         ll2.push("First");
         System.out.println("Linkedlist 8 "+ll2);
         
         ll2.remove();
         System.out.println("Linkedlist 9 "+ll2);
         //[123, IS, 456, 789, DSA, 2, 3, Last]
         
         ll2.add(3, "DSA");
         System.out.println("Linkedlist 10 "+ll2);
         
         ll2.removeLastOccurrence("DSA");
         System.out.println("Linkedlist 11 "+ll2);
         
         ll2.set(2, "999");
         System.out.println("Linkedlist 12 "+ll2);
         System.out.println("Size "+ll2.size());
        
        
        
        
    }
    
}
