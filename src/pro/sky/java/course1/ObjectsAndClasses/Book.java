package pro.sky.java.course1.ObjectsAndClasses;

public class Book {
    private final String titleBook;
    private final Author author;
    private int yearOfPublication;

    public Book(String titleBook, int yearOfPublication, Author author){
        this.titleBook= titleBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getTitleBook(){
        return titleBook;
    }

    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
}
