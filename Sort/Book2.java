public class Book2 {

    private String BookName, authorName;
    private int price, BookId;

    public Book2(String BookName, String authorName, int price, int BookId){

        this.authorName = authorName;
        this.BookId = BookId;
        this.BookName = BookName;
        this.price = price;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "BookName='" + BookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", BookId=" + BookId +
                '}';
    }
}
