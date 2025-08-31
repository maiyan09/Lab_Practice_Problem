import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        double sum = 0;
        System.out.print("Enter 6 numbers: ");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = sum / 6;
        for (int i = 0; i < 6; i++) {
            if (arr[i] > avg) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
