import java.util.Scanner;

public class Cab2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cb type (Mini, Sedan, or SUV): ");
        String cab = sc.next();
        System.out.print("Distance in km: ");
        double distance = sc.nextDouble();


        double amount = 0;
        if (cab.equals("Mini")) {
            amount = distance*10;
            if (distance > 100) {
                amount = amount - (amount*0.1);   
            }
        }
        else if (cab.equals("Sedan")) {
            amount = distance*15;
            if (distance > 100) {
                amount = amount - (amount*0.1);   
            }
        }
        else if (cab.equals("SUV")) {
            amount = distance*20;
            if (distance > 100) {
                amount = amount - (amount*0.1);   
            }
        }
        System.out.println("Cab type: "+ cab);
        System.out.println("Total fare: "+ amount);
        System.out.println("Total distance: "+ distance);

    }
}
