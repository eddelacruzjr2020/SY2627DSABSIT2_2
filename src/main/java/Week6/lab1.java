/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;


/**
 *
 * @author Edmundo Dela Cruz
 */
public class lab1 extends JFrame implements ActionListener{
    
    private JTextField txtInput;
    private DefaultListModel<String> listmodel;
    private JList<String> listTask;
    private JScrollPane scrollPane;
    private JButton btnAdd, btnRemove, btnComplete, btnClear;
    private LinkedList<String> linkedList;
    
    
    //Dito lahat ng components
    lab1(){
        setTitle("Lab 1 Activitity");
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        txtInput = new JTextField();
        txtInput.setBounds(50, 50, 400, 30);
        add(txtInput);
        
        linkedList = new LinkedList<>(); //BE
        listmodel = new DefaultListModel<>(); //FE
        
        listTask = new JList<>(listmodel);
        scrollPane = new JScrollPane(listTask);
        scrollPane.setBounds(50, 100, 400, 250);
        add(scrollPane);
        
        btnAdd = new JButton("Add");
        btnAdd.setBounds(50, 400, 80, 30);
        add(btnAdd);
        
        btnRemove = new JButton("Remove");
        btnRemove.setBounds(180, 400, 80, 30);
        add(btnRemove);
        
        btnComplete = new JButton("Complete");
        btnComplete.setBounds(310, 400, 80, 30);
        add(btnComplete);
        
        btnClear = new JButton("Clear");
        btnClear.setBounds(430, 400, 80, 30);
        add(btnClear);
        
        //Add to ActionListener
        btnAdd.addActionListener(this);
        btnRemove.addActionListener(this);
        btnComplete.addActionListener(this);
        btnClear.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAdd){
            String task = txtInput.getText().trim();
            if(!task.isEmpty()){
                linkedList.add(task); //BE
                listmodel.addElement(task);
                txtInput.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "Please enter task first", "ERROR Message", JOptionPane.ERROR_MESSAGE);
            }
        }else if(e.getSource() == btnRemove){
            int indexSelected = listTask.getSelectedIndex();
            if(indexSelected != -1){
                linkedList.remove(indexSelected); //BE
                listmodel.removeElementAt(indexSelected); //FE
            }else{
                JOptionPane.showMessageDialog(this, "Please select task first before removing", "ERROR Message", JOptionPane.ERROR_MESSAGE);
            }
        }else if(e.getSource() == btnComplete){
            int indexSelected = listTask.getSelectedIndex();
            if(indexSelected != -1){
                String completedTask = listmodel.getElementAt(indexSelected) + " (Completed)";
                listmodel.set(indexSelected, completedTask);
                listTask.setSelectedIndex(-1);
            }else{
                JOptionPane.showMessageDialog(this, "Please select task first before completing", "ERROR Message", JOptionPane.ERROR_MESSAGE);
            }
        }else if(e.getSource() == btnClear){
            listmodel.clear(); //FE
            linkedList.clear(); //BE
            
        }
    }
    
}
