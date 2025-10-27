import java.util.Scanner;

public class LongestStringLength2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        String[] arr = new String[n];
        int maxLenght = -1;
        String s = null;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            if (arr[i].length() >= maxLenght) {
                maxLenght = arr[i].length();
                s = arr[i];
            }
        }
        System.out.println("Maximum String is: "+ s + " and the lenght is: " + maxLenght);
    }
}
