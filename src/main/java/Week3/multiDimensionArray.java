/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.dsabsit2_2;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class multiDimensionArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        //{1, 2, 3}
        //{4, 5, 6}
        //{7, 8, 9}
        
        int[][] multiArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        //System.out.println(multiArray[i][j]);
        
        for(int i=0; i<multiArray.length; i++){
            for(int j=0; j<multiArray[i].length; j++){
                System.out.println(multiArray[i][j] + " ");
                Thread.sleep(500);
                
            }
            System.out.println();
        }
    }
    
}
