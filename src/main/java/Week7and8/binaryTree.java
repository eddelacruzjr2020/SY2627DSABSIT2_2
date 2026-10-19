/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7and8;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class binaryTree {
    
    node root;
    
    binaryTree(){
        root =null;
    }
    
    
    //Method to add node to the tree
    public void add(int value){
        root = addRecursive(root, value);
    }
    
    //Add Recursive value
    private node addRecursive(node current, int value){
        if(current == null){
            return new node(value);
        }
        
        if(value < current.value){
            current.left = addRecursive(current.left, value);
        }else{
            current.right = addRecursive(current.right, value);
        }
        
        return current;
    }
    
    //In Order Transversal - Left, Root, Right
    public void transversalInOrder(node node){
        if(node != null){
            transversalInOrder(node.left);
            System.out.print(" "+node.value);
            transversalInOrder(node.right);
        }
    }
    
    
    //Pre Order Transversal - Root, Left, Right
    public void transversalPreOrder(node node){
        if(node != null){
            System.out.print(" "+node.value);
            transversalPreOrder(node.left);
            transversalPreOrder(node.right);
        }
    }
    
    //Post Order Transversal - Left, Right, Root
    public void transversalPostOrder(node node){
        if(node != null){
            transversalPostOrder(node.left);
            transversalPostOrder(node.right);
            System.out.print(" "+node.value);
        }
    }
}
