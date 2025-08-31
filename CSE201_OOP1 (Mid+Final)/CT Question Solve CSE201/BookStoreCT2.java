//Base Class
public class BookStoreCT2 {
    String bookTitle;
    double pricePerBook;
    int stock;
    double discount;

    BookStoreCT2 (String bookTitle, double pricePerBook, int stock, double discount) {
        this.bookTitle = bookTitle;
        this.pricePerBook = pricePerBook;
        this.stock = stock;
        this.discount = discount;
    }
    void sellBook(int quantity) {
        if (quantity > stock) {
            System.out.println("Insufficient stock.");
        }
        else {
            stock -= quantity;
        }
    }
    double calculateBill(int quantity) {
        return quantity*pricePerBook;
    }
    void bookInfo(){
        System.out.println("Title: "+ bookTitle);
        System.out.println("Price per book: " + pricePerBook);
        System.out.println("Available Stock: " + stock);
        System.out.println("Discount: " + discount);
    }
}
