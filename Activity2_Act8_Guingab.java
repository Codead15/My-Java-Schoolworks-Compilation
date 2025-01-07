import java.util.Scanner;

public class Activity2_Act8_Guingab {
    private final String name;
    private final int age;
    private final String studentNumber;
    private final String birthdate;
    private final String course;
    private final String hobby;
    private final String dreamWork;

    public Activity2_Act8_Guingab(String name, int age, String studentNumber,
            String birthdate, String course, String hobby, String dreamWork) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
        this.birthdate = birthdate;
        this.course = course;
        this.hobby = hobby;
        this.dreamWork = dreamWork;
    }

    public void displayInfo() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Course: " + course);
        System.out.println("Hobby: " + hobby);
        System.out.println("Dream Work: " + dreamWork);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter student number: ");
        String studentNumber = scanner.nextLine();

        System.out.print("Enter birthdate: ");
        String birthdate = scanner.nextLine();

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        System.out.print("Enter hobby: ");
        String hobby = scanner.nextLine();

        System.out.print("Enter dream work: ");
        String dreamWork = scanner.nextLine();

        Activity2_Act8_Guingab person = new Activity2_Act8_Guingab(name, age, 
               studentNumber, birthdate, course, hobby, dreamWork);
        person.displayInfo();

        scanner.close();
    }
}




