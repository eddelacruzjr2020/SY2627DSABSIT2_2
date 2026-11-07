/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15to16;

import java.util.HashMap;
import java.util.Arrays;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class TimeComplexityDemo {
    
    public static  void main(String[] args){
        
        int[] data = new int[100000];
        
        for (int i = 0; i < 100000; i++){
            data[i] = i;
        }
        
        int target = 68472;
        
        //Linear Search
        long startTime = System.nanoTime();
        //Call Linear Search Method
        int linearResults = linearSearch(data, target);
        long endTime = System.nanoTime();
        
        //Display results for linear Search
        System.out.println("Linear Search:");
        System.out.println("Found at index: "+ linearResults);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds\n");
        
        //Binary Search
        startTime = System.nanoTime();
        
        int binaryResult = binarySearch(data, target);
        
        endTime = System.nanoTime();
        
        //Display results for Binary Search
        System.out.println("Binary Search:");
        System.out.println("Found at index: "+ binaryResult);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds\n");
        
        
        //Hashing
        startTime = System.nanoTime();
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        for (int num : data){
            map.put(num, true);
        }
        
        long setupEndTime = System.nanoTime();
        
        boolean hashResult = map.containsKey(target);
        
        endTime = System.nanoTime();
        
        //Display results for Hash results
        System.out.println("Hashing:");
        System.out.println("HashMap Setup Time: " + (setupEndTime - startTime) + " nanoseconds\n");
        System.out.println("HashMap Lookup Time: " + (endTime - setupEndTime) + " nanoseconds\n");
        System.out.println("Found: "+ hashResult);
    }
   
   //Linear Search 
   public static int linearSearch(int[] data, int target){
       
       for (int i = 0; i< data.length; i++){
           if(data[i] == target){
               return i;
           }
       }
       
       return -1;
        
   }
   
   //Binary Search
   public static int binarySearch(int[] data, int target){
       
       int left = 0, right = data.length - 1;
       
       while(left <= right){
           int mid = left + (right - left) /2;
           if(data[mid] == target){
               return mid;
           }else if(data[mid] < target){
               left = mid + 1;
           }else{
               right = mid - 1;
           } 
       }
       return -1;
       
   }
    
}
