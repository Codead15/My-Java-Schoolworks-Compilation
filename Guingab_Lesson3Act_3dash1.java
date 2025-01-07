//Guingab_Lesson3.Act1_3

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Guingab_Lesson3Act_3dash1 extends JFrame implements ActionListener {
    private JTextField txtName, txtHours, txtRate;
    private JButton btnOk, btnCancel;

    public Guingab_Lesson3Act_3dash1() {
        super("Gross Pay Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create text fields
        txtName = new JTextField(20);
        txtHours = new JTextField(10);
        txtRate = new JTextField(10);

        // Create buttons
        btnOk = new JButton("OK");
        btnCancel = new JButton("Cancel");
        btnOk.addActionListener(this);
        btnCancel.addActionListener(this);

        // Create labels
        JLabel lblName = new JLabel("Worker Name:");
        JLabel lblHours = new JLabel("Hours Worked:");
        JLabel lblRate = new JLabel("Rate per hr:");

        // Create panel for labels and text fields
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(lblName);
        inputPanel.add(txtName);
        inputPanel.add(lblHours);
        inputPanel.add(txtHours);
        inputPanel.add(lblRate);
        inputPanel.add(txtRate);

        // Create panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(btnOk);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        buttonPanel.add(btnCancel);

        // Create panel for input and button panels
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPanel.add(inputPanel, BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Add content panel to frame
        setContentPane(contentPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOk) {
            String name = txtName.getText();
            int hours = Integer.parseInt(txtHours.getText());
            double rate = Double.parseDouble(txtRate.getText());
            double grossPay = hours * rate;
            JOptionPane.showMessageDialog(this,
                    "Worker Name: " + name + "\n" +
                    "Hours Worked: " + hours + "\n" +
                    "Rate per hr: " + rate + "\n" +
                    "Gross Pay: PHP " + grossPay);
        } else if (e.getSource() == btnCancel) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new Guingab_Lesson3Act_3dash1();
    }
}
