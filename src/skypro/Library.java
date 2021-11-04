package skypro;

public class Library {
    private int size;
    private final Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void printBookInfo(String bookName) {
        for (Book book : books) {
            if (book != null) {
                if (bookName.equals(book.getBookName())) {
                    System.out.println(book.getAuthorName() + ": " + book.getBookName() + " " + book.getAge());
//                    printLibrary(books);
                    break;
                }
            }
        }
    }

    public void putInNewLibrary(Book book) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;

            }
        }
    }
    public void changeBookAge(String bookName,int age) {

        for (Book book : books) {
            if (book != null) {
                if (bookName.equals(book.getBookName())) {
                    book.setAge(age);
                }
                System.out.println(book.getAuthorName() + ": " + book.getBookName() + " " + book.getAge());
            }
        }
    }
}
//    public void printLibrary(Book[] books) {
//        System.out.println("Check printLibrary ");
//        for (int i = 0; i < books.length; i++) {
//            if (books[i] != null) {
//                System.out.println(books[i].getAuthorName() + ": " + books[i].getBookName() + " " + books[i].getAge());
//                break;
//            }




