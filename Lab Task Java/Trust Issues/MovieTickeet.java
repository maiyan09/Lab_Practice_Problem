public class MovieTickeet {
    String movieName;
    String showTIme;
    int availableSeats;

    MovieTickeet(String movieName, String showTime, int availableSeats) {
        this.movieName = movieName;
        this.showTIme = showTime;
        this.availableSeats = availableSeats;
    }

    public void bookTickets(int numberOfTickets) {
        if (numberOfTickets > 0 && numberOfTickets <= availableSeats) {
            availableSeats -= numberOfTickets;
        }
    }
    public void cancelTickets(int numberOfTickets){
        availableSeats += numberOfTickets;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public void display() {
        System.out.println("Movie name: " + movieName);
        System.out.println("Show Time: " + showTIme);
        System.out.println("Available seats: " + availableSeats);
    }
}
