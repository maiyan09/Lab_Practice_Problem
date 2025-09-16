public class SubClass1 extends MovieTickeet{

    SubClass1(String movieName, String showTime, int availableSeats) {
        super(movieName, showTime, availableSeats);
    }
    @Override
    public void bookTickets(int numberOfTickets) {
        super.bookTickets(numberOfTickets);
        if (numberOfTickets >= 5) {
            System.out.println("Discount added");
        }
    }     
}
