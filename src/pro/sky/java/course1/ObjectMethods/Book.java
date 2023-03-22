package pro.sky.java.course1.ObjectMethods;

public class Book {
    private final String TITLE_BOOK;
    private final Author AUTHOR;
    private int yearOfPublication;

    public Book(String titleBook, int yearOfPublication, Author author){
        this.TITLE_BOOK = titleBook;
        this.yearOfPublication = yearOfPublication;
        this.AUTHOR = author;
    }

    public String getTitleBook(){
        return TITLE_BOOK;
    }

    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public boolean equals(Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }
        Book book = (Book) other;
        return TITLE_BOOK.equals(book.TITLE_BOOK);
    }

    public int hashCode(){
        return java.util.Objects.hash(TITLE_BOOK);
    }

    public String toString(){
        return "Название книги: " + TITLE_BOOK + " Год публикации: " + yearOfPublication + " " + AUTHOR;
    }
}
