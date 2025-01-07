//Guingab, Jayco M. - Lesson3.Act1_2

package guingab_lesson3act_3dash2;
import javax.swing.*;



public class Guingab_Lesson3Act_3dash2 {

    private JTextField dollarField;
    private JLabel resultLabel;

    public Guingab_Lesson3Act_3dash2 () {
        // Set up the window
        JFrame frame = new JFrame("Dollar to Peso Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the components
        JLabel dollarLabel = new JLabel("Enter the dollar amount:");
        dollarField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(e -> convertDollarToPeso());
        resultLabel = new JLabel();

        // Add the components to the content pane
        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);
        panel.add(dollarLabel);
        panel.add(dollarField);
        panel.add(convertButton);
        panel.add(resultLabel);
        frame.getContentPane().add(panel);

        // Pack and show the window
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void convertDollarToPeso() {
        // Get the input value
        double dollars = Double.parseDouble(dollarField.getText());

        // Convert dollars to pesos
        double pesos = dollars * 50.50;

        // Display the result in a message dialog
        JOptionPane.showMessageDialog(null, String.format(
                "Dollar Amount: $%.2f\nConverted Amount: ₱%.2f", dollars, pesos), "Dollar to Peso Converter", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        // Create and show the GUI
        new Guingab_Lesson3Act_3dash2();
    }
}
