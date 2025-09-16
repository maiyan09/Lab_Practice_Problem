public class Order {
    private String customerName;
    protected String paymentMethod;
    protected String orderTime;


    Order(String customerName, String paymentMethod, String orderTime)
    {
        this.customerName = customerName;
        this.paymentMethod = paymentMethod;
        this.orderTime = orderTime;
    }

    public String getCustomerName() {
        return customerName;
    }
}