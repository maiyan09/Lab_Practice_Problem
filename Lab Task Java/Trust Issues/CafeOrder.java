public class CafeOrder extends Order{
    public String coffeeType;
    protected int coffeeCount;
    protected double coffeePrice;
    public boolean takeAway;
    private double discountPercent;
    private int flavorCount;

    public CafeOrder(String customerName, String coffeeType, int coffeeCount, double coffeePrice, boolean takeAway, String paymentMethod, String orderTime) {
        super(customerName, paymentMethod, orderTime);
        this.coffeeType = coffeeType;
        this.coffeeCount = coffeeCount;
        this.coffeePrice = coffeePrice;
        this.takeAway = takeAway;
        this.discountPercent = 0.0;
        this.flavorCount = 0;
    }

    public double calculateTotal() {
        return (coffeeCount * coffeePrice)+flavorCount;
    }

    double applyDiscount(double discountPercent) {
        this.discountPercent = discountPercent;
        double total = calculateTotal();
        return total - (total * (discountPercent/100));
    }

    public void addFlavor(int flavorCount) {
        this.flavorCount+=flavorCount;
    }
    public void generateBill(){ 
        System.out.println("customer name:" + getCustomerName());
        System.out.println("coffee type: "+coffeeType);
        System.out.println("count: "+coffeeCount);
        System.out.println("Price: "+ calculateTotal());

        if(discountPercent > 0) {
            double t = calculateTotal() - (calculateTotal() * (discountPercent/100));
            System.out.println("After discount, Price: "+ t);
        }
        else 
            System.out.println("Without discount price: "+ calculateTotal());
    }
}