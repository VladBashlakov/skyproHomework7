package skypro;

public class Book {
    String bookName;
    String authorName;
    int age;

    public Book(String bookName, String authorName, int age) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.age = age;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
