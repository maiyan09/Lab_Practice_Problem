import java.util.ArrayList;

public class OnlineShopping {
    ArrayList <Integer> productId = new ArrayList<>();
    ArrayList <Integer> productIdCopy = new ArrayList<>();
    //String productName;
    int productAmount;
    int productStock;
    //boolean availability;
    double price;

    OnlineShopping (ArrayList <Integer> productId, int productStock, double price) {
        this.productId = productId;
        this.productStock = productStock;
        this.price = price;
    }
    public void shoppingCart(int id, int noOfAmount) {
        if ((noOfAmount > productStock) || (!productId.contains(id))) {
            System.out.println("Invalid product ID or Out of stock");
        }
        else {
            System.out.println("Product "+ id + " added to cart");
            productIdCopy.add(id);
            productId.remove(Integer.valueOf(id));
            productAmount = productAmount + noOfAmount;
            productStock -= noOfAmount;
        }
    }
    public boolean availableStock(int id) {
        if (productId.contains(id)) {
            return true;
        } 
        else {
            System.out.println("Sorry the product is out of stock");
            return false;
       }
    }
    public void removeCart(int id, int noOfAmount) {
        if (productIdCopy.contains(id)) {
                System.out.println("Product "+ id + " removed from the cart");
                productId.add(id);
                productAmount -= noOfAmount;
        }
        else {
            System.out.println("Invalid ID");
        }
    }
    public double price() {
        return productAmount*price;
    }
    public void display() {
        System.out.print("Available product id: " + productId + "\n");
    }
}
