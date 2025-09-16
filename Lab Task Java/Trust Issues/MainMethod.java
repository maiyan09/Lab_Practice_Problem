import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CafeOrder order = null;
        while (true) {
            System.out.println("\nCafe Order System");
            System.out.println("1. Create a new order");
            System.out.println("2. Generate bill for an order");
            System.out.println("3. Apply a discount");
            System.out.println("4. Add extra flavors");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            System.out.println();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter coffee type: ");
                    String type = sc.nextLine();

                    System.out.print("Enter coffee count: ");
                    int count = sc.nextInt();

                    System.out.print("Enter price for a coffee: ");
                    double price = sc.nextDouble();

                    System.out.print("Takeaway: ");
                    boolean takeAway = sc.nextBoolean();
                    sc.nextLine();

                    System.out.print("Enter payment method: ");
                    String payment = sc.nextLine();

                    System.out.print("Enter order time: ");
                    String time = sc.nextLine();

                    order = new CafeOrder(name, type, count, price, takeAway, payment, time);                   
                    
                    break;
                case 2:
                    order.generateBill();
                    break;
                case 3:
                    System.out.println("Enter discount percentage: ");
                    double d = sc.nextDouble();
                    order.applyDiscount(d);
                    break;
                case 4:
                    System.out.print("Enter flavour count: ");
                    int f = sc.nextInt();
                    order.addFlavor(f);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }
          
    }

}
