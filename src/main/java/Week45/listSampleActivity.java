/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week45;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class listSampleActivity extends JFrame implements ActionListener{
    private LinkedList<String> linkedList;
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JScrollPane scrollPane;
    private JTextField txtField;
    private JButton btnAdd, btnRemove;
     
    listSampleActivity(){
        linkedList = new LinkedList<>();
        listModel = new DefaultListModel<>();
       
        setTitle("List Sample App");
        setSize(300, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JList
        list = new JList<>(listModel);
        scrollPane = new JScrollPane(list);
        scrollPane.setBounds(10, 10, 260, 180);
        add(scrollPane);
        
        //Text Field
        txtField = new JTextField();
        txtField.setBounds(10, 200, 160, 30);
        add(txtField);
        
        //Buttons
        btnAdd = new JButton("Add");
        btnAdd.setBounds(180, 200, 80, 30);
        add(btnAdd);
        
        btnRemove = new JButton("Remove");
        btnRemove.setBounds(180, 240, 80, 30);
        add(btnRemove);
        
        //Add to ActionListener
        btnAdd.addActionListener(this); 
        btnRemove.addActionListener(this); 
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAdd){
            String listItem = txtField.getText().trim();
            if(!listItem.isEmpty()){
                //Kapag di sya empty gagawin nya to
                linkedList.add(listItem); //Linkedlist
                listModel.addElement(listItem); //Display in GUI
                txtField.setText("");
            }else{
                //kapag empty
                JOptionPane.showMessageDialog(this, "Please enter item first", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }else if(e.getSource() == btnRemove){
            int indexSelected = list.getSelectedIndex();
            
            if(indexSelected != - 1){
                //Kapag may ni select ako sa list ito gagawin ko
                linkedList.remove(indexSelected);
                listModel.removeElementAt(indexSelected);
                
            }else{
                //Kapag wala akong ni select sa list
                JOptionPane.showMessageDialog(this, "Please select   item first", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
    }
    
}
