//Guingab, Jayco M. - Lesson3.Act1_4
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Guingab_Lesson3Act_4dash1 extends JFrame implements ActionListener { 
    
     // Declare GUI components
    private JLabel lblName, lblRate, lblPrincipal, lblTerm;
    private JTextField txtName, txtRate, txtPrincipal, txtTerm;
    private JButton btnOk, btnCancel;

    public Guingab_Lesson3Act_4dash1() {
        // Set up GUI components
        setTitle("Interest Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        lblName = new JLabel("Customer's Name:");
        txtName = new JTextField(20);
        lblRate = new JLabel("Rate of Interest:");
        txtRate = new JTextField(20);
        lblPrincipal = new JLabel("Principal Amount:");
        txtPrincipal = new JTextField(20);
        lblTerm = new JLabel("Term (in days):");
        txtTerm = new JTextField(20);

        JPanel pnlInput = new JPanel();
        pnlInput.setLayout(new GridLayout(4, 2));
        pnlInput.add(lblName);
        pnlInput.add(txtName);
        pnlInput.add(lblRate);
        pnlInput.add(txtRate);
        pnlInput.add(lblPrincipal);
        pnlInput.add(txtPrincipal);
        pnlInput.add(lblTerm);
        pnlInput.add(txtTerm);

        btnOk = new JButton("OK");
        btnCancel = new JButton("Cancel");
        btnOk.addActionListener(this);
        btnCancel.addActionListener(this);

        JPanel pnlButtons = new JPanel();
        pnlButtons.setLayout(new FlowLayout());
        pnlButtons.add(btnOk);
        pnlButtons.add(btnCancel);

        add(pnlInput);
        add(pnlButtons);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOk) {
            // Get input values
            String name = txtName.getText();
            double rate = Double.parseDouble(txtRate.getText());
            double principal = Double.parseDouble(txtPrincipal.getText());
            double term = Double.parseDouble(txtTerm.getText()) / 360.0;

            // Calculate interest and withholding tax
            double interest = principal * rate * term;
            double withholdingTax = interest * 0.10;
            double netInterest = interest - withholdingTax;

            // Display results in message dialog box
            String message = String.format("Customer's Name: %s\nWithholding Tax: Php %.2f\nNet Interest: Php %.2f", name, withholdingTax, netInterest);
            JOptionPane.showMessageDialog(this, message, "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == btnCancel) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
     Guingab_Lesson3Act_4dash1 calculator = new Guingab_Lesson3Act_4dash1();
    }
}