import java.util.Scanner;
public class GreaterFall23_1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int arr3[] = new int[n];
        System.out.print("Enter the elements for first array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the elements for second array: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr1[i] < arr2[j]) {
                    count++;
                }
            }
            arr3[i] = count;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr3[i]);
        }
    }
}
