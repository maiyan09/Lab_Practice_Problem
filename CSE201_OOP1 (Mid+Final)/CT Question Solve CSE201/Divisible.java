import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double sum = 0;
        int count = 0;
        
        System.out.print("Numbers divsible by 5 are: ");
        for (int i = num1; i <= num2; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
                sum +=  i;
                count++;
            }
        }
        if (count > 0) {
            double avg = sum / count;
            System.out.println("\nAverage of numbers divisible by 5: "+ avg);
        } else {
            System.out.println("No numbers divisible by 5.");
        }
    }
}
