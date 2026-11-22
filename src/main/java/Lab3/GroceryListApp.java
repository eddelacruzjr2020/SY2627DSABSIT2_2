package Lab3;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashSet;

public class GroceryListApp extends JFrame implements ActionListener {

    private JLabel lblEnterItem;
    private JTextField txtEnterItem;
    private JButton btnAdd, btnRemove, btnBought, btnView;
    private JList<String> listItems;
    private JScrollPane scrollPane;
    private DefaultListModel<String> listModel;
    private HashSet<String> grocerySet;

    // Constructor
    public GroceryListApp() {

        grocerySet = new HashSet<>();
        listModel = new DefaultListModel<>();

        // Frame setup
        setTitle("Grocery List");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Text field
        txtEnterItem = new JTextField();
        txtEnterItem.setBounds(20, 50, 150, 30);
        add(txtEnterItem);

        // Label
        lblEnterItem = new JLabel("Enter Grocery Item");
        lblEnterItem.setBounds(180, 50, 150, 30);
        add(lblEnterItem);

        // Add button
        btnAdd = new JButton("Add Item");
        btnAdd.setBounds(20, 100, 150, 30);
        add(btnAdd);

        // Remove button
        btnRemove = new JButton("Remove Item");
        btnRemove.setBounds(20, 150, 150, 30);
        add(btnRemove);

        // Mark as Bought button
        btnBought = new JButton("Mark as Bought");
        btnBought.setBounds(20, 200, 150, 30);
        add(btnBought);

        // View button
        btnView = new JButton("View List");
        btnView.setBounds(20, 250, 150, 30);
        add(btnView);

        // JList setup
        listItems = new JList<>(listModel);

        scrollPane = new JScrollPane(listItems);
        scrollPane.setBounds(200, 100, 150, 200);
        add(scrollPane);

        // Action listeners
        btnAdd.addActionListener(this);
        btnRemove.addActionListener(this);
        btnBought.addActionListener(this);
        btnView.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String item = txtEnterItem.getText().trim();
        int indexSelected;

        // ADD ITEM
        if (e.getSource() == btnAdd) {

            if (!item.isEmpty()) {

                if (grocerySet.add(item)) {

                    listModel.addElement(item);
                    txtEnterItem.setText("");

                    // Success message
                    JOptionPane.showMessageDialog(
                            this,
                            "Groceries successfully added",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Item already exists in the list",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Item cannot be empty",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }

        // REMOVE ITEM
        } else if (e.getSource() == btnRemove) {

            indexSelected = listItems.getSelectedIndex();

            if (indexSelected != -1) {

                String itemToRemove =
                        listModel.getElementAt(indexSelected);

                grocerySet.remove(itemToRemove);
                listModel.remove(indexSelected);

                // Success message
                JOptionPane.showMessageDialog(
                        this,
                        "Groceries successfully removed",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE
                );

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Select an item to remove",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }

        // MARK AS BOUGHT
        } else if (e.getSource() == btnBought) {

            indexSelected = listItems.getSelectedIndex();

            if (indexSelected != -1) {

                String originalItem =
                        listModel.getElementAt(indexSelected);

                if (!originalItem.endsWith(" (Bought)")) {

                    String boughtItem =
                            originalItem + " (Bought)";

                    // Update HashSet
                    grocerySet.remove(originalItem);
                    grocerySet.add(boughtItem);

                    // Update JList
                    listModel.set(indexSelected, boughtItem);

                    // Success message
                    JOptionPane.showMessageDialog(
                            this,
                            "Groceries successfully marked as bought",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Item is already marked as bought",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Select an item to mark as bought",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }

        // VIEW GROCERY LIST
        } else if (e.getSource() == btnView) {

            if (grocerySet.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Grocery List: is empty",
                        "Grocery List",
                        JOptionPane.INFORMATION_MESSAGE
                );

            } else {

                StringBuilder sb = new StringBuilder();

                // Enhanced for-each loop
                for (String groceryItem : grocerySet) {

                    sb.append(groceryItem).append("\n");
                }

                JOptionPane.showMessageDialog(
                        this,
                        "Grocery List:\n" + sb.toString(),
                        "Grocery List",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        new GroceryListApp();
    }
}