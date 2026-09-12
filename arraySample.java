/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.dsabsit2_2;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class arraySample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        String name1 = "Ed";
        String name2 = "Dela";
        String name3 = "Cruz";
        
        String[] names = new String[]{"Ed", "Dela", "Cruz", "DSA", "IS", "FUN"};
        int[] ages = new int[3];

        
        double[] grades = new double[100];
        
        for(int i = 0; i<names.length; i++){
            System.out.println("Names is "+names[i]);
            Thread.sleep(500);
        }
        
        System.out.println(names[2]);
    }
    
}
