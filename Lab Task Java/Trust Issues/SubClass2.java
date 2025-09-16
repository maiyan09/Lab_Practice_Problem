public class SubClass2 extends MovieTickeet{
    private int studentID;
    public SubClass2(String movieName, String showTime, int availableSeats, int studentID) {
        super(movieName, showTime, availableSeats);
        this.studentID = studentID;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentID);
    }  
    @Override
    public void bookTickets(int numberOfTickets) {
        super.bookTickets(numberOfTickets);
        if (numberOfTickets > 5) {
            System.out.println("Discount added");
        }
    }
}
