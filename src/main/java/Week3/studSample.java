/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsabsit2_2;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class studSample {
    
    private String name;
    private int age;
    
    studSample(String name, int age){
        this.name=name;
        this.age=age;
        
    }
    
    
        public void setName(String name){
            this.name=name;
        }

        public String getName(){
            return name;
        }

        public void setAge(int age){
            this.age=age;
        }
    
    public int getAge(){
        return age;
    }
    
    public void displayInfo(){
        System.out.println("Name:" +name+" Age" +age);
    }
    

    
    
    
}
