import java.util.Scanner;

public class ElectricityBill2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total number of units consume:  ");
        int unit = sc.nextInt();
        int bill = 0;

        if (unit <= 50) {
            bill = unit * 3;
        }
        else if (unit <= 150) {
            bill = 150 + ((unit-50) * 5);

        }
        else if (unit <= 300) {
            bill = 650 + ((unit-150) * 8);
        }
        else if (unit > 300) {
            bill = 1850 + (unit-300) * 10;
        }
        System.out.println("Totoal bill: "+ bill + " taka");
    }
}
