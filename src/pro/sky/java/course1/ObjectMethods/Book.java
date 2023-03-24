package pro.sky.java.course1.ObjectMethods;

import java.util.Objects;

public class Book {
    private final String titleBook;
    private final Author author;
    private int yearOfPublication;

    public Book(String titleBook, int yearOfPublication, Author author){
        this.titleBook = titleBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }
    public String getTitleBook(){
        return titleBook;
    }
    public int getYearOfPublication(){
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return yearOfPublication == book.yearOfPublication && Objects.equals(titleBook, book.titleBook) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(titleBook, author, yearOfPublication);
    }
    @Override
    public String toString(){
        return "Название книги: " + titleBook + " Год публикации: " + yearOfPublication + " " + author;
    }
}
