package pro.sky.java.course1.ObjectsAndClasses;

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

    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
}
