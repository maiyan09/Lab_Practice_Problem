public class BookStoreAppCT2 {
    public static void main(String[] args) {
        BookStoreCT2 b = new BookStoreCT2("Science Fiction",75.4, 150, 2);
        b.sellBook(50);
        b.calculateBill(20);
        b.bookInfo();
    }
}
