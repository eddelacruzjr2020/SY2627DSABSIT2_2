/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsabsit2_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



/**
 *
 * @author Edmundo Dela Cruz
 */
public class mcDollibee extends JFrame implements ActionListener{
    
    private JLabel hdrMcDollibee, lblBurger, lblFries, lblSoda, lblBurgerCount, lblFriesCount, lblSodaCount;
    private JButton btnAddBurger, btnMinusBurger, btnAddFries, btnMinusFries, btnAddSoda, btnMinusSoda, btnReviewOrder, btnResetOrder;
    private JComboBox<String> cmbBurger, cmbFries, cmbSoda;
    private JTextArea txaSummary;
    private static final String[] sizes = {"Small", "Medium", "Large"};
    private int intBurger = 0;
    private int intFries = 0;
    private int intSoda = 0;
    
    
    mcDollibee(){
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Header
        hdrMcDollibee = new JLabel("McDollibee");
        hdrMcDollibee.setBounds(250, 50, 100, 30);
        add(hdrMcDollibee);
        
        lblBurger = new JLabel("Burger:");
        lblBurger.setBounds(50, 100, 100, 30);
        add(lblBurger);
        
        lblFries = new JLabel("Fries:");
        lblFries.setBounds(50, 150, 100, 30);
        add(lblFries);
        
        lblSoda = new JLabel("Soda:");
        lblSoda.setBounds(50, 200, 100, 30);
        add(lblSoda);
        
        lblBurgerCount = new JLabel("0");
        lblBurgerCount.setBounds(180, 100, 50, 30);
        add(lblBurgerCount);
        
        lblFriesCount = new JLabel("0");
        lblFriesCount.setBounds(180, 150, 50, 30);
        add(lblFriesCount);
        
        lblSodaCount = new JLabel("0");
        lblSodaCount.setBounds(180, 200, 50, 30);
        add(lblSodaCount);
        
        btnAddBurger = new JButton("+");
        btnAddBurger.setBounds(260, 100, 50, 30);
        add(btnAddBurger);
        
        btnMinusBurger = new JButton("-");
        btnMinusBurger.setBounds(320, 100, 50, 30);
        add(btnMinusBurger);
        
        btnAddFries = new JButton("+");
        btnAddFries.setBounds(260, 150, 50, 30);
        add(btnAddFries);
        
        btnMinusFries = new JButton("-");
        btnMinusFries.setBounds(320, 150, 50, 30);
        add(btnMinusFries);
        
        btnAddSoda = new JButton("+");
        btnAddSoda.setBounds(260, 200, 50, 30);
        add(btnAddSoda);
        
        btnMinusSoda = new JButton("-");
        btnMinusSoda.setBounds(320, 200, 50, 30);
        add(btnMinusSoda);
        
        cmbBurger = new JComboBox<>(sizes);
        cmbBurger.setBounds(400, 100, 100, 30);
        add(cmbBurger);
        
        cmbFries = new JComboBox<>(sizes);
        cmbFries.setBounds(400, 150, 100, 30);
        add(cmbFries);
        
        cmbSoda = new JComboBox<>(sizes);
        cmbSoda.setBounds(400, 200, 100, 30);
        add(cmbSoda);
        
        btnReviewOrder = new JButton("Review Order");
        btnReviewOrder.setBounds(50, 250, 150, 30);
        add(btnReviewOrder);
        
        btnResetOrder = new JButton("Reset Order");
        btnResetOrder.setBounds(230, 250, 150, 30);
        add(btnResetOrder);
        
        txaSummary = new JTextArea();
        txaSummary.setBounds(50, 300, 500, 250);
        txaSummary.setEditable(false);
        add(txaSummary);
        
        // Add to ActionListener
        btnAddBurger.addActionListener(this); 
        btnMinusBurger.addActionListener(this);
        btnAddFries.addActionListener(this);
        btnMinusFries.addActionListener(this);
        btnAddSoda.addActionListener(this);
        btnMinusSoda.addActionListener(this);
        btnReviewOrder.addActionListener(this);
        btnResetOrder.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAddBurger){
            intBurger++;
            lblBurgerCount.setText(String.valueOf(intBurger));
        }else if(e.getSource() == btnMinusBurger){
            if(intBurger > 0){
                intBurger--;
                lblBurgerCount.setText(String.valueOf(intBurger));
            }
            
        }else if(e.getSource() == btnAddFries){
            intFries++;
            lblFriesCount.setText(String.valueOf(intFries));
        }else if(e.getSource() == btnMinusFries){
            if(intFries > 0){
                intFries--;
                lblFriesCount.setText(String.valueOf(intFries));
            }
            
        }else if(e.getSource() == btnAddSoda){
            intSoda++;
            lblSodaCount.setText(String.valueOf(intSoda));
        }else if(e.getSource() == btnMinusSoda){
            if(intSoda > 0){
                intSoda--;
                lblSodaCount.setText(String.valueOf(intSoda));
            }
            
        }else if(e.getSource() == btnReviewOrder){
            double totalCost = 0.0;
            
            totalCost+=calculateCost(intBurger, (String) cmbBurger.getSelectedItem());
            totalCost+=calculateCost(intFries, (String) cmbFries.getSelectedItem());
            totalCost+=calculateCost(intSoda, (String) cmbSoda.getSelectedItem());
            
            txaSummary.setText("Burger ("+cmbBurger.getSelectedItem()+"): "+intBurger+"\n" +
                               "Fries ("+cmbFries.getSelectedItem()+"): "+intFries+"\n" +
                               "Soda ("+cmbSoda.getSelectedItem()+"): "+intSoda+"\n" +
                               "Total Cost: $"+totalCost+"");
        }else if(e.getSource() == btnResetOrder){
            lblBurgerCount.setText("0");
            lblFriesCount.setText("0");
            lblSodaCount.setText("0");
            
            cmbBurger.setSelectedIndex(0);
            cmbFries.setSelectedIndex(0);
            cmbSoda.setSelectedIndex(0);
            
            txaSummary.setText("");
        }
        
    }
    
    private double calculateCost(int count, String size){
        double price = 0.0;
        switch(size){
            case "Small" -> price = 5.00;
            case "Medium" -> price = 7.50;
            case "Large" -> price = 10.00;
        }
        
        return count * price;
    }
}
