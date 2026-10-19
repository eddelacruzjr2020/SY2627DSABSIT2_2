/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week7and8;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        binaryTree tree = new binaryTree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);
//        tree.add(10);
        
        
//        //InOrder Transversal 
//        System.out.println("\nInOrder Transversal ");
//        tree.transversalInOrder(tree.root);
        
//        //PreOrder Transversal 
//        System.out.println("\nPreOrder Transversal ");
//        tree.transversalPreOrder(tree.root);
        
        //PostOrder Transversal 
        System.out.println("\nPostOrder Transversal ");
        tree.transversalPostOrder(tree.root);
        
    }
    
}
