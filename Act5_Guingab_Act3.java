//Guingab, Jayco M. - Activity#3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Act5_Guingab_Act3 {
    public static void calculateEquivalentGrade(double grade) {
        double GRD_equivalent = 0;
        String MSG_rmrk = "You passed this subject. Congratulations!";

        if (grade >= 97 && grade <= 100) {
            GRD_equivalent = 1.00;
        } else if (grade >= 94 && grade <= 96) {
            GRD_equivalent = 1.25;
        } else if (grade >= 91 && grade <= 93) {
            GRD_equivalent = 1.50;
        } else if (grade >= 88 && grade <= 90) {
            GRD_equivalent = 1.75;
        } else if (grade >= 85 && grade <= 87) {
            GRD_equivalent = 2.00;
        } else if (grade >= 82 && grade <= 84) {
            GRD_equivalent = 2.25;
        } else if (grade >= 79 && grade <= 81) {
            GRD_equivalent = 2.50;
        } else if (grade >= 76 && grade <= 78) {
            GRD_equivalent = 2.75;
        } else if (grade == 75) {
            GRD_equivalent = 3.00;
        } else if (grade < 75) {
            GRD_equivalent = 5.00;
            MSG_rmrk = "You have failed in this subject, study hard and good luck next time!";
        }

        System.out.printf("\nYour equivalent grade is %.2f. %s%n", GRD_equivalent, MSG_rmrk);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String CALC_choice;
        String Y_N = "Y";

        while (Y_N.equalsIgnoreCase("Y")) {
            System.out.println("\n[P] Prelim");
            System.out.println("[M] Midterm");
            System.out.println("[F] Final");
            System.out.println("[E] Exit");
            System.out.print("\nPlease enter your choice: ");
            CALC_choice = input.readLine().toUpperCase();

            switch (CALC_choice) {
                case "P":
                    // PRELIM VARIABLES
                    double pQuiz, pRecit, pProj, pExamRating; // input variables
                    double prelimClsStd, prelimProj, prelimLec, prelimGrade; // computation variables

                    // GET THE USER INPUT FOR PRELIM GRADE
                    System.out.print("\nPlease enter grade for Prelim quiz:\t  ");
                    pQuiz = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Prelim recitation: ");
                    pRecit = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Prelim project:\t  ");
                    pProj = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Prelim exam:\t  ");
                    pExamRating = Double.parseDouble(input.readLine());

                    // PRELIM GRADE COMPUTATION
                    prelimClsStd = (pQuiz + pRecit) / 2;
                    prelimProj = pProj * 0.40;
                    prelimLec = (((2 * prelimClsStd + pExamRating) / 3) * 0.60);
                    prelimGrade = prelimProj + prelimLec;

                    // OUTPUT FOR PRELIM GRADES
                    System.out.println("\nComputed Grade");
                    System.out.println("  The Prelim Class Standing grade: " + String.format("%.2f", prelimClsStd));
                    System.out.println("  The Prelim Project grade is: " + String.format("    %.2f", prelimProj));
                    System.out.println("  The Prelim Lecture grade is: " + String.format("    %.2f", prelimLec));
                    System.out.println("  The Prelim Grade is: " + String.format("\t           %.2f", prelimGrade));

                    calculateEquivalentGrade(prelimGrade); // call the function to determine the equivalent grade
                    break;

                case "M":
                    // PRELIM VARIABLES
                    double pQuizM, pRecitM, pProjM, pExamRatingM; // input variables
                    double prelimClsStdM, prelimProjM, prelimLecM, prelimGradeM; // computation variables

                    // MIDTERM VARIABLES
                    double mQuiz, mRecit, mProj, mExamRating; // input variables
                    double midtermClsStd, midtermProj, midtermLec, midtermClsAve, midtermGrade; // computation variables

                    // GET THE USER INPUT FOR PRELIM GRADE
                    System.out.print("\nPlease enter grade for Prelim quiz:\t  ");
                    pQuizM = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Prelim recitation: ");
                    pRecitM = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Prelim project:\t  ");
                    pProjM = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Prelim exam:\t  ");
                    pExamRatingM = Double.parseDouble(input.readLine());

                    // GET THE USER INPUT FOR MIDTERM GRADES
                    System.out.print("\nPlease enter grade for Midterm quiz:\t   ");
                    mQuiz = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Midterm recitation: ");
                    mRecit = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Midterm project:\t   ");
                    mProj = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Midterm exam:\t   ");
                    mExamRating = Double.parseDouble(input.readLine());

                    // PRELIM GRADE COMPUTATION
                    prelimClsStdM = (pQuizM + pRecitM) / 2;
                    prelimProjM = pProjM * 0.40;
                    prelimLecM = (((2 * prelimClsStdM + pExamRatingM) / 3) * 0.60);
                    prelimGradeM = prelimProjM + prelimLecM;

                    // MIDTERM GRADE COMPUTATION
                    midtermClsStd = (mQuiz + mRecit) / 2;
                    midtermProj = mProj * 0.40;
                    midtermLec = ((2 * midtermClsStd + mExamRating) / 3) * 0.60;
                    midtermClsAve = midtermProj + midtermLec;
                    midtermGrade = (2 * midtermClsAve + prelimGradeM) / 3;

                    // OUTPUT FOR MIDTERM GRADES
                    System.out.println("\nComputed Grade");
                    System.out.println("  The Midterm Class Standing grade: " + String.format("    %.2f", midtermClsStd));
                    System.out.println("  The Midterm Project grade is: " + String.format("        %.2f", midtermProj));
                    System.out.println("  The Midterm Lecture grade is: " + String.format("        %.2f", midtermLec));
                    System.out.println("  The Midterm Grade is: " + String.format("                %.2f", midtermGrade));

                    calculateEquivalentGrade(midtermGrade); // call the function to determine the equivalent grade
                    break;

                case "F":
                    // PRELIM VARIABLES
                    double pQuizF, pRecitF, pProjF, pExamRatingF; // input variables
                    double prelimClsStdF, prelimProjF, prelimLecF, prelimGradeF; // computation variables

                    // MIDTERM VARIABLES
                    double mQuizF, mRecitF, mProjF, mExamRatingF; // input variables
                    double midtermClsStdF, midtermProjF, midtermLecF, midtermClsAveF, midtermGradeF; // computation variables

                    // FINAL VARIABLES
                    double fQuiz, fRecit, fProj, fExamRating; // input variables
                    double finalClsStd, finalProj, finalLec, finalClsAve, finalGrade; // computation variables

                    // GET THE USER INPUT FOR PRELIM GRADE
                    System.out.print("\nPlease enter grade for Prelim quiz:\t  ");
                    pQuizF = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Prelim recitation: ");
                    pRecitF = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Prelim project:    ");
                    pProjF = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Prelim exam:       ");
                    pExamRatingF = Double.parseDouble(input.readLine());

                    // GET THE USER INPUT FOR MIDTERM GRADES
                    System.out.print("\nPlease enter grade for Midterm quiz:\t   ");
                    mQuizF = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Midterm recitation: ");
                    mRecitF = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Midterm project:    ");
                    mProjF = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Midterm exam:       ");
                    mExamRatingF = Double.parseDouble(input.readLine());

                    // GET THE USER INPUT FOR FINALS GRADES
                    System.out.print("\nPlease enter grade for Finals quiz:\t  ");
                    fQuiz = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Finals recitation: ");
                    fRecit = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Finals project:    ");
                    fProj = Double.parseDouble(input.readLine());
                    System.out.print("Please enter grade for Finals exam:       ");
                    fExamRating = Double.parseDouble(input.readLine());

                    // PRELIM GRADE COMPUTATION
                    prelimClsStdF = (pQuizF + pRecitF) / 2;
                    prelimProjF = pProjF * 0.40;
                    prelimLecF = (((2 * prelimClsStdF + pExamRatingF) / 3) * 0.60);
                    prelimGradeF = prelimProjF + prelimLecF;

                    // MIDTERM GRADE COMPUTATION
                    midtermClsStdF = (mQuizF + mRecitF) / 2;
                    midtermProjF = mProjF * 0.40;
                    midtermLecF = ((2 * midtermClsStdF + mExamRatingF) / 3) * 0.60;
                    midtermClsAveF = midtermProjF + midtermLecF;
                    midtermGradeF = (2 * midtermClsAveF + prelimGradeF) / 3;

                    // FINAL GRADE COMPUTATION
                    finalClsStd = (fQuiz + fRecit) / 2;
                    finalProj = fProj * 0.40;
                    finalLec = ((2 * finalClsStd + fExamRating) / 3) * 0.60;
                    finalClsAve = finalProj + finalLec;
                    finalGrade = (2 * finalClsAve + midtermGradeF) / 3;

                    // OUTPUT FOR FINAL GRADES
                    System.out.println("\nComputed Grade");
                    System.out.println("  The Final Class Standing grade: " + String.format("   %.2f", finalClsStd));
                    System.out.println("  The Final Project grade is: " + String.format("       %.2f", finalProj));
                    System.out.println("  The Final Lecture grade is: " + String.format("       %.2f", finalLec));
                    System.out.println("  The Final Grade is: " + String.format("\t\t     %.2f", finalGrade));

                    calculateEquivalentGrade(finalGrade); // call the function to determine the equivalent grade
                    break;

                case "E":
                    System.out.println("We appreciate your usage of this program. Goodbye!!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("\nDo you want to try again (Y/N)? ");
            Y_N = input.readLine();
        }
    }
}
