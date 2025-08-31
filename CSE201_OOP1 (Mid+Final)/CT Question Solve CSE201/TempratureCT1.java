import java.util.Scanner;

public class TempratureCT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp[] = new double[5];
        System.out.print("Enter 5 temperature (in Celsius): ");
        for (int i = 0; i < 5; i++) {
            temp[i] = sc.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            if (temp[i] < 10) {
                System.out.println("Clod");
            }
            else if (temp[i] >= 10 && temp[i] <= 25) {
                System.out.println("Moderate");
            }
            else {
                System.out.println("Hot");
            } 
        } 
    }
}
