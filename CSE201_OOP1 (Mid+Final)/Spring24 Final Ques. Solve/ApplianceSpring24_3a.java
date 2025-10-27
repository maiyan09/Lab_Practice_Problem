public abstract class ApplianceSpring24_3a {
    private String brand;
    private double price;
    private boolean isOn;
    Appliance(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    //Setter for brand, price :)
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }

    public void turnOn() {
        isOn = true;
    }
    //abstract class
    public abstract void display();
}
