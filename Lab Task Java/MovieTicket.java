public class MovieTicket {
    //instance variable
    String movieName;
    String showTime;
    int availableSeats;

    //default constructor
    MovieTicket() {
        // this.movieName = "Leo Messi";
        // this.showTime = "2 am";
        // this.availableSeats = 0;
    }
    //Constructor with movie name and show time
    MovieTicket(String movieName, String showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }
    //Constructor with movie name, show time, and available seats
    MovieTicket(String movieName, String showTime, int availableSeats) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.availableSeats = availableSeats;
    }
    //Method For Booking Ticket
    void bookTickets(int numberOfTickets) {
        if (availableSeats >= numberOfTickets && numberOfTickets > 0) {
            availableSeats -= numberOfTickets;
        }
        else {
            System.out.println("Seats are overbooked");
        }
    }
    void cancelTickets(int numberOfTickets) {
        if (numberOfTickets > 0)
        availableSeats += numberOfTickets;
    }
    int getAvailableSeats() {
        return availableSeats;
    }
    public void display() {
        System.out.println("Movie Name: "+movieName);
        System.out.println("Show Time: "+showTime);
        System.out.println("Seats Available: "+ availableSeats);
    }
}
