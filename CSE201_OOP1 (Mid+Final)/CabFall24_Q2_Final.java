import java.util.Scanner;

public class CabFall24_Q2_Final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cb type (Mini, Sedan, or SUV): ");
        String cab = sc.next();
        System.out.print("Distance in km: ");
        double distance = sc.nextDouble();


        double fare = 0;
        if (cab.equals("Mini")) {
            fare = distance*10;
            if (distance > 100) {
                fare = fare - (fare*0.1);   
            }
        }
        else if (cab.equals("Sedan")) {
            fare = distance*15;
            if (distance > 100) {
                fare = fare - (fare*0.1);   
            }
        }
        else if (cab.equals("SUV")) {
            fare = distance*20;
            if (distance > 100) {
                fare = fare - (fare*0.1);   
            }
        }
        System.out.println("Cab type: "+ cab);
        System.out.println("Total fare: "+ fare);
        System.out.println("Total distance: "+ distance);

    }
}
