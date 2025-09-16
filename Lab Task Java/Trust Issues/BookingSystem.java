import java.util.ArrayList;
import java.util.Scanner;

public class BookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MovieTickeet> tickets = new ArrayList<>();
        MovieTickeet ticket = null;

        while (true) {
            System.out.println("1. Create a new ticket (choose between 11 MovieTicket, 12 GroupMovieTicket, or 13 StudentMovieTicket)");
            System.out.println("2. Book tickets");
            System.out.println("3. Cancel tickets");
            System.out.println("4. Display tickets");
            System.out.println("5. show avilable tickets");
            System.out.println("6. Exit");

            System.out.print("Enter your option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    case 11:
                        sc.nextLine();
                        System.out.print("Enter movie name, show time, available seats: ");
                        String movieName = sc.nextLine();
                        String showTime = sc.nextLine();
                        int seats = sc.nextInt();
                        ticket = new MovieTickeet(movieName, showTime, seats);
                    break;
                    case 12:
                        sc.nextLine();
                        System.out.print("Enter movie name, show time, available seats: ");
                        String movieName1 = sc.nextLine();
                        String showTime1 = sc.nextLine();
                        int seats1 = sc.nextInt();
                        ticket = new SubClass1(movieName1, showTime1, seats1);
                    break;
                    case 13:
                        sc.nextLine();
                        System.out.print("Enter movie name, show time, available seats and Student ID: ");
                        String movieName2 = sc.nextLine();
                        String showTime2 = sc.nextLine();
                        int seats2 = sc.nextInt();
                        int id2 = sc.nextInt();
                        ticket = new SubClass2(movieName2, showTime2, seats2, id2);
                    break;
                case 2:
                    
                default:
                    break;
            }
        }
    }
}
