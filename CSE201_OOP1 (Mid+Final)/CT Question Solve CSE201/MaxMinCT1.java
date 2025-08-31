import java.util.Scanner;
public class MaxMinCT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        
        System.out.print("Enter 8 numbers: ");
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maximum = arr[0];
        int minimum = arr[0];
        for (int i = 0; i < 8; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            else {
                minimum = arr[i];
            }
        }
        System.out.println("the difference between the maximum and minimum numbers in the array is: " + (maximum-minimum));
    }
}
