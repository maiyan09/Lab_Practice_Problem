import java.util.Scanner;

public class Sum2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.print("Enter elements for the array: ");
        int arr[] = new int[n];
        int sumOdd = 0,sumEven = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                sumEven = sumEven + arr[i];
            }
            else {
                sumOdd = sumOdd + arr[i];
            }
        }
        System.out.println("Sum of odd number is: " + sumOdd);
        System.out.print("Sum of Even number is: " + sumEven);
    }
}
