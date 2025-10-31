import java.util.Scanner;
// Answer of question 2. a
public class SalaryBonus2a {

    public static double pow(double base, double power) {
        return Math.pow(base, power);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary and year of service: ");
        double salary = sc.nextDouble();
        double year = sc.nextDouble();

        double bonus = (salary * (pow(1.05, year))) - salary;
        if (year > 2) {
            System.out.println("Bonus salary: "+bonus);
        }
        else {
            System.out.println("Not eligible");
        }
    }
}
