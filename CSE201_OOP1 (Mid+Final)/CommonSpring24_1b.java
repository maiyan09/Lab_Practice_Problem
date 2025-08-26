import java.util.Scanner;
public class CommonSpring24_1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the first array: ");
        int n1 = sc.nextInt();
        System.out.print("Enter size of the second array: ");
        int n2 = sc.nextInt();

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        System.out.print("Enter the elements for the first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the elements for the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean common = false;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    common = true;
                }
            }
        }
        if (common == false) {
            System.out.println("No common elements is found.");
        }
    }
}
