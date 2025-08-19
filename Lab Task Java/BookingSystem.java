import java.util.Scanner;
public class BookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket t = null;
        System.out.println("How you want to create the ticket object: ");
        System.out.println("Option 1: Use default constructor, then enter details manually.");
        System.out.println("Option 2: Use constructor with movie name and show time.");
        System.out.println("Option 3: Use constructor with all parameters.");
        int option;
        System.out.print("Enter your option (1-3): ");
        option = sc.nextInt();
        sc.nextLine();
        //for invalid option
        while (option < 1 || option > 3) {
            System.out.print("Enter your option again (1-3): ");
            option = sc.nextInt();
            sc.nextLine();
        }

        switch (option) {
            case 1:
                t = new MovieTicket();
                System.out.print("Enter a movie name: ");
                t.movieName = sc.nextLine();
                System.out.print("Enter show time: ");
                t.showTime = sc.nextLine();
                System.out.print("Enter available seats: ");
                t.availableSeats = sc.nextInt();
                break;    
            case 2:
                System.out.print("Enter a movie name: ");
                String movieName = sc.nextLine();
                System.out.print("Enter show time: ");
                String showTime = sc.nextLine();
                t = new MovieTicket(movieName, showTime);
                System.out.print("Enter available seats: ");
                t.availableSeats = sc.nextInt();
                break;
            case 3:
                System.out.print("Enter a movie name: ");
                String movieName3 = sc.nextLine();
                System.out.print("Enter show time: ");
                String showTime3 = sc.nextLine();
                System.out.print("Enter available seats: ");
                int seat3 = sc.nextInt();
                t = new MovieTicket(movieName3, showTime3, seat3);
                break;
        }
        while (true) {
            System.out.println("\nShowing menu");
            System.out.println("1. Book tickets.");
            System.out.println("2. Cancel tickets.");
            System.out.println("3. Display ticket details.");
            System.out.println("4. Show available seats.");
            System.out.println("5. Exit.");
            System.out.print("Enter menu: ");
            int menu = sc.nextInt();
            if (menu == 1) {
                System.out.print("Enter number of tickets to book: ");
                int ticket = sc.nextInt();
                t.bookTickets(ticket);
            }
            else if (menu == 2) {
                System.out.print("Enter number of tickets to cancel: ");
                int ticket = sc.nextInt();
                t.cancelTickets(ticket);
            }
            else if (menu == 3) {
                t.display();
            }
            else if (menu == 4) {
                System.out.println("Available seats: "+ t.getAvailableSeats());
            }
            else if (menu == 5) {
                System.out.println("Exit");
                break;
            }
            else {
                System.out.println("Invalid menu. Enter menu Between (1-5)");
            }
        }
    }
}
