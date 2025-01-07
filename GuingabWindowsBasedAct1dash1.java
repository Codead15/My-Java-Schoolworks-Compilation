//Guingab, Jayco M. - Lesson3.Act1
import javax.swing.*;


public class GuingabWindowsBasedAct1dash1{

    public static void main(String[] args) {

        // Create the JFrame and set its properties
        JFrame frame = new JFrame("GRADES CALCULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the JPanel and set its layout to BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create the labels and text fields for each information
        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameTextField = new JTextField(20);
        JLabel courseLabel = new JLabel("Course Name:");
        JTextField courseTextField = new JTextField(20);
        JLabel quiz1Label = new JLabel("Quiz 1 Grade:");
        JTextField quiz1TextField = new JTextField(5);
        JLabel quiz2Label = new JLabel("Quiz 2 Grade:");
        JTextField quiz2TextField = new JTextField(5);
        JLabel rec1Label = new JLabel("Recitation 1 Grade:");
        JTextField rec1TextField = new JTextField(5);
        JLabel rec2Label = new JLabel("Recitation 2 Grade:");
        JTextField rec2TextField = new JTextField(5);
        JLabel proj1Label = new JLabel("Project 1 Grade:");
        JTextField proj1TextField = new JTextField(5);
        JLabel proj2Label = new JLabel("Project 2 Grade:");
        JTextField proj2TextField = new JTextField(5);
        JLabel examLabel = new JLabel("Exam Grade:");
        JTextField examTextField = new JTextField(5);

        // Add the labels and text fields to the panel
        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(courseLabel);
        panel.add(courseTextField);
        panel.add(quiz1Label);
        panel.add(quiz1TextField);
        panel.add(quiz2Label);
        panel.add(quiz2TextField);
        panel.add(rec1Label);
        panel.add(rec1TextField);
        panel.add(rec2Label);
        panel.add(rec2TextField);
        panel.add(proj1Label);
        panel.add(proj1TextField);
        panel.add(proj2Label);
        panel.add(proj2TextField);
        panel.add(examLabel);
        panel.add(examTextField);

        // Create the calculate button
        JButton calculateButton = new JButton("Calculate");

        // Add the action listener to the calculate button
        calculateButton.addActionListener(e -> {
            // Get the values from the text fields
            String studentName = nameTextField.getText();
            String courseName = courseTextField.getText();
            double quiz1Grade = Double.parseDouble(quiz1TextField.getText());
            double quiz2Grade = Double.parseDouble(quiz2TextField.getText());
            double rec1Grade = Double.parseDouble(rec1TextField.getText());
            double rec2Grade = Double.parseDouble(rec2TextField.getText());
            double proj1Grade = Double.parseDouble(proj1TextField.getText());
            double proj2Grade = Double.parseDouble(proj2TextField.getText());
            double examGrade = Double.parseDouble(examTextField.getText());

            // Compute the average of two quizzes, two recitations, and two projects
            double quizAverage = (quiz1Grade + quiz2Grade) / 2.0;
            double recitationAverage = (rec1Grade + rec2Grade) / 2.0;
            double projectAverage = (proj1Grade + proj2Grade) / 2.0;
            double classStanding = (quizAverage + recitationAverage + projectAverage) / 3.0;

            // Compute the preliminary and midterm grades
             double preliminaryGrade = (classStanding * 2) + examGrade;
             double midtermGrade = (preliminaryGrade + examGrade) / 2.0;
             
             // Create the message to display
String message = "Student Name: " + studentName
        + "\nCourse Name: " + courseName
        + "\nQuiz Average: " + quizAverage
        + "\nRecitation Average: " + recitationAverage
        + "\nProject Grade: " + projectAverage
        + "\nClass Standing: " + classStanding
        + "\n\nPreliminary Grade: " + preliminaryGrade
        + "\nMidterm Grade: " + midtermGrade;

// Display the message in a message dialog box
JOptionPane.showMessageDialog(null, message, "Student's GRADE", JOptionPane.INFORMATION_MESSAGE);

    });
        panel.add(calculateButton);
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}