public class Act2_Lesson9_Guingab {
    private final String Stud_FirstName;
    private final String Stud_LastName;
    private final int Stud_Year;
    private final String Stud_Course;
    private final String Stud_Section;
    private final double Stud_MidtermGrade;
    private final double Stud_FinalGrade;

    public Act2_Lesson9_Guingab(String firstName, String lastName, int year, 
            String course, String section,
            double midtermGrade, double finalGrade) {
        this.Stud_FirstName = firstName;
        this.Stud_LastName = lastName;
        this.Stud_Year = year;
        this.Stud_Course = course;
        this.Stud_Section = section;
        this.Stud_MidtermGrade = midtermGrade;
        this.Stud_FinalGrade = finalGrade;
    }

    public void introduceSelf() {
        System.out.println("Full Name: " + Stud_FirstName + " " + Stud_LastName);
        System.out.println("Course: " + Stud_Course);
        System.out.println("Year: " + Stud_Year);
        System.out.println("Section: " + Stud_Section);
    }

    public void evaluateGrade() {
        double averageGrade = (Stud_MidtermGrade + Stud_FinalGrade) / 2.0;
        System.out.println("Average Grade: " + averageGrade);

        if (averageGrade > 100) {
            System.out.println("Invalid Grade");
        } else if (averageGrade >= 98 && averageGrade <= 100) {
            System.out.println("With Highest Honors");
        } else if (averageGrade >= 95 && averageGrade < 98) {
            System.out.println("With High Honors");
        } else if (averageGrade >= 90 && averageGrade < 95) {
            System.out.println("With Honors");
        } else if (averageGrade >= 75 && averageGrade < 90) {
            System.out.println("Passed");
        } else {
            System.out.println("Grade: Failed");
        }
    }

    public static void main(String[] args) {
        // Create a student object
        Act2_Lesson9_Guingab student = new Act2_Lesson9_Guingab("Jayco", "Guingab", 
             2, "BSIT", "2-1", 99.7 , 100.0);

        // Invoke object methods
        student.introduceSelf();
        student.evaluateGrade();
    }
}
