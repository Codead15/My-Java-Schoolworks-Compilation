public class Act1_Lesson9_Guingab {
    private String Stud_FirstName;
    private String Stud_LastName;
    private int Stud_Year;
    private String Stud_Course;
    private String Stud_Section;
    private double Stud_MidtermGrade;
    private double Stud_FinalGrade;

    public Act1_Lesson9_Guingab(String firstName, String lastName, int year,
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

    // Getters and setters for the attributes

    public String getStud_FirstName() {
        return Stud_FirstName;
    }

    public void setStud_FirstName(String firstName) {
        this.Stud_FirstName = firstName;
    }

    public String getStud_LastName() {
        return Stud_LastName;
    }

    public void setStud_LastName(String lastName) {
        this.Stud_LastName = lastName;
    }

    public int getStud_Year() {
        return Stud_Year;
    }

    public void setStud_Year(int year) {
        this.Stud_Year = year;
    }

    public String getStud_Course() {
        return Stud_Course;
    }

    public void setStud_Course(String course) {
        this.Stud_Course = course;
    }

    public String getStud_Section() {
        return Stud_Section;
    }

    public void setStud_Section(String section) {
        this.Stud_Section = section;
    }

    public double getStud_MidtermGrade() {
        return Stud_MidtermGrade;
    }

    public void setStud_MidtermGrade(double midtermGrade) {
        this.Stud_MidtermGrade = midtermGrade;
    }

    public double getStud_FinalGrade() {
        return Stud_FinalGrade;
    }

    public void setStud_FinalGrade(double finalGrade) {
        this.Stud_FinalGrade = finalGrade;
    }

    public void displayInfo() {
        System.out.println("Name: " + Stud_FirstName + " " + Stud_LastName);
        System.out.println("Year: " + Stud_Year);
        System.out.println("Course: " + Stud_Course);
        System.out.println("Section: " + Stud_Section);
        System.out.println("Midterm Grade: " + Stud_MidtermGrade);
        System.out.println("Final Grade: " + Stud_FinalGrade);
    }

    public static void main(String[] args) {
        // Create a student object
        Act1_Lesson9_Guingab student = new Act1_Lesson9_Guingab("Jayco", "Guingab",
           2, "BSIT", "2-1", 99.7, 100.0);

        // Display student information
        student.displayInfo();
    }
}
