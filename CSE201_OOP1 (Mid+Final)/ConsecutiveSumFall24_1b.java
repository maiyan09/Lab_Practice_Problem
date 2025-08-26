import java.util.Scanner;
public class ConsecutiveSumFall24_1b {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.print("Enter the elements for array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int index = -1;
		for (int i = 0; i < n-1; i++) {
			if ((arr[i]+arr[i+1] > sum) && (arr[i]-arr[i+1]) == -1) {
				sum = arr[i]+arr[i+1];
				index = i;
			}
		}
		System.out.println("Maximum sum of consecutive elements: "+ sum + " " + "(from "+arr[index] + " + " + arr[index+1] + ")");
	}
}
