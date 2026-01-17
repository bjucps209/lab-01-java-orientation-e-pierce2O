import java.util.*;
public class Grader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade;
        int numStudents = Integer.parseInt(scan.nextLine()); 
        // System.out.println(grade);
        for (int i = 0; i < numStudents; i++) {
            grade = Integer.parseInt(scan.nextLine());
            if (grade < 38) {
                System.out.println(grade);
            } else if ((grade + 1) % 5 == 0) {
                System.out.println(grade + 1);
            } else if ((grade + 2) % 5 == 0) {
                System.out.println(grade + 2);
            } else {
                System.out.println(grade);
            }

        }
    }
}
