public class AirConditionerSpring24_3b extends Appliance{
    private String capacity;
    private double currentTemparature;
    AirConditioner(String brand, double price, String capacity) {
        super(brand, price);
        this.capacity = capacity;
    }
    public void turnOn(double temparature) {
        currentTemparature = temparature;
        super.turnOn();
    }
    @Override
    public void display() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Capacity: " + capacity);
        System.out.println("Price: " + getPrice());
    }
}
