package pro.sky.java.course1.ObjectMethods;

import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
    @Override
    public String toString(){
        return "Автор: " + this.name + " " + this.surname;
    }
}
