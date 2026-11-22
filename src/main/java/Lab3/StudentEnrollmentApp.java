
package Lab3;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashSet;

public class StudentEnrollmentApp extends JFrame implements ActionListener {

    private JLabel lblEnterStudent;
    private JTextField txtEnterStudent;
    private JButton btnEnroll, btnWithdraw, btnLOA, btnView;
    private JList<String> listStudents;
    private JScrollPane scrollPane;
    private DefaultListModel<String> listModel;
    private HashSet<String> students;

    // Constructor
    public StudentEnrollmentApp() {

        students = new HashSet<>();
        listModel = new DefaultListModel<>();

        // Frame setup
        setTitle("Student Enrollment System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Text field setup
        txtEnterStudent = new JTextField();
        txtEnterStudent.setBounds(20, 50, 150, 30);
        add(txtEnterStudent);

        // Label setup
        lblEnterStudent = new JLabel("Enter Student Name");
        lblEnterStudent.setBounds(180, 50, 150, 30);
        add(lblEnterStudent);

        // Enroll button
        btnEnroll = new JButton("Enroll");
        btnEnroll.setBounds(180, 100, 150, 30);
        add(btnEnroll);

        // Withdraw button
        btnWithdraw = new JButton("Withdraw");
        btnWithdraw.setBounds(180, 150, 150, 30);
        add(btnWithdraw);

        // Mark as LOA button
        btnLOA = new JButton("Mark as LOA");
        btnLOA.setBounds(180, 200, 150, 30);
        add(btnLOA);

        // View Enrolled button
        btnView = new JButton("View Enrolled");
        btnView.setBounds(180, 250, 150, 30);
        add(btnView);

        // JList setup
        listStudents = new JList<>(listModel);

        scrollPane = new JScrollPane(listStudents);
        scrollPane.setBounds(20, 100, 150, 180);
        add(scrollPane);

        // Action listeners
        btnEnroll.addActionListener(this);
        btnWithdraw.addActionListener(this);
        btnLOA.addActionListener(this);
        btnView.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String studentName = txtEnterStudent.getText().trim();

        // ENROLL STUDENT
        if (e.getSource() == btnEnroll) {

            if (!studentName.isEmpty()) {

                if (students.add(studentName)) {

                    listModel.addElement(studentName);
                    txtEnterStudent.setText("");

                    JOptionPane.showMessageDialog(
                            this,
                            "Student successfully enrolled",
                            "Enroll",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Student already enrolled",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Student name cannot be empty",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }

        // WITHDRAW STUDENT
        } else if (e.getSource() == btnWithdraw) {

            if (!studentName.isEmpty()) {

                if (students.remove(studentName)) {

                    listModel.removeElement(studentName);
                    txtEnterStudent.setText("");

                    JOptionPane.showMessageDialog(
                            this,
                            "Student successfully withdrawn",
                            "Withdraw",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Student not found",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Enter student name to withdraw",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }

        // MARK STUDENT AS LOA
        } else if (e.getSource() == btnLOA) {

            if (!studentName.isEmpty()) {

                if (students.contains(studentName)) {

                    String loaName = studentName + " (LOA)";

                    students.remove(studentName);
                    students.add(loaName);

                    listModel.set(
                            listModel.indexOf(studentName),
                            loaName
                    );

                    txtEnterStudent.setText("");

                    JOptionPane.showMessageDialog(
                            this,
                            "Student successfully marked as LOA",
                            "LOA",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Student not found or already marked as LOA",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Enter student name to mark as LOA",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }

        // VIEW ENROLLED STUDENTS
        } else if (e.getSource() == btnView) {

            if (students.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Enrolled Students: is empty",
                        "Enrolled Students",
                        JOptionPane.INFORMATION_MESSAGE
                );

            } else {

                StringBuilder sb = new StringBuilder();

                // Enhanced for-each loop
                for (String student : students) {

                    sb.append(student).append("\n");
                }

                JOptionPane.showMessageDialog(
                        this,
                        "Enrolled Students:\n" + sb.toString(),
                        "Enrolled Students",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        new StudentEnrollmentApp();
    }
}
