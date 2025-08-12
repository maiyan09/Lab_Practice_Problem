public class MovieTicket {
    String movieName;
    String showTime;
    int availableSeats;

    void bookTickets(int numberOfTickets) {
        if (availableSeats >= numberOfTickets && numberOfTickets > 0) {
            availableSeats -= numberOfTickets;
        }
        else {
            System.out.println("Seats are overbooked");
        }
    }
    void cancelTickets(int numberOfTickets) {
        availableSeats += numberOfTickets;
    }
    int getAvailableSeats() {
        return availableSeats;
    }
    public void display() {
        System.err.println("Movie Name: "+movieName);
        System.out.println("Show Time: "+showTime);
        System.out.println("Seats Available: "+ availableSeats);
    }
}
