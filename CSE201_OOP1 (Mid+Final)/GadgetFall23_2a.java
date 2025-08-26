public class GadgetFall23_2a {
    String brand, model;
    double price;

    GadgetFall23_2a (String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public String getBrand() {
        System.out.println("Brand of the gadget is: " + brand);
        return brand;
    }
    public void setPrice(double newPrice) {
        price = newPrice;
        System.out.println("Updated price is: " + price);
    }
    public boolean isAffordable() {
        if (price <= 1000) {
            System.out.println("THe gadget is affordable.");
            return true;
        }
        else {
            System.out.println("THe gadget is not affordable.");
            return false;
        }
    }
}
