public class Application {
    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.movieName = "Spider Man";
        t.showTime = "2 am";
        t.availableSeats = 200;

        t.bookTickets(5);
        t.display();
        t.cancelTickets(2);
        t.getAvailableSeats();
        System.out.println("After cenceling some tickets: ");
        t.display();

    }
}
