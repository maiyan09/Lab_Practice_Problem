import java.util.Scanner;
public class GradeSpring23_1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade(A,B,C,D,E,F): ");
        String grade = sc.next();

        if (grade.equals("A")) {
            System.out.println("4.0");
        }
        else if (grade.equals("B")) {
            System.out.println("3.5");
        }
        else if (grade.equals("C")) {
            System.out.println("3.0");
        }
        else if (grade.equals("D")) {
            System.out.println("2.5");
        }
        else if (grade.equals("E")) {
            System.out.println("2.0");
        }
        else if (grade.equals("F")) {
            System.out.println("0.0");
        }
        else {
            System.out.println("Invalid Grade");
        }
    }
}
