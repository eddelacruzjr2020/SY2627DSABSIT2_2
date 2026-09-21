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
public class LinkedListSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList ll = new LinkedList();
        ll.add("Ed");
        ll.add(123);
        ll.add(true);
        ll.add(5462.5234f);
        ll.add(5462.5234);
        
        System.out.println("LinkedList 1 "+ll);
        
        Collection<Integer> collect = new ArrayList<>();
        collect.add(123);
        collect.add(456);
        collect.add(789);
        
        
        
        LinkedList ll1 = new LinkedList<>(collect);
        ll1.add("DSA");
        ll1.add("is");
        ll1.add("FUN");
        System.out.println("Linkedlist 2 "+ll1);
        
        
        
    }
    
}
