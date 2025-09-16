import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> productId = new ArrayList<>();
        productId.add(100);
        productId.add(101);
        productId.add(102);
        productId.add(103);
        productId.add(104);
        productId.add(105);
        // System.out.println("Available product id: " + productId);

        OnlineShopping s = new OnlineShopping(productId, productId.size(), 50);

        while (true) {
            System.out.println("Showing menu");
            System.out.println("1. Add product to shopping cart");
            System.out.println("2. Available Stock");
            System.out.println("3. Remove product");
            System.out.println("4. Total cost");
            System.out.println("5. Display available product");

            System.out.print("Enter your option: ");
            int option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    System.out.print("Enter product id and amount: ");
                    int id1 = sc.nextInt();
                    int AMOUNT = sc.nextInt();
                    s.shoppingCart(id1, AMOUNT);
                    break;
                case 2:
                    System.out.println("Available product id: " + productId);
                    System.out.print("Enter product id : ");
                    int id2 = sc.nextInt();
                    System.out.println("Available in stock: ?" + s.availableStock(id2));
                    break;
                case 3:
                    System.out.print("Enter product id you want to remove: ");
                    int id3 = sc.nextInt();
                    s.removeCart(id3);
                    break;
                case 4:
                    System.out.println("Total cost: " + s.price());
                    break;
                case 5: 
                    s.display();
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }
    }

}
