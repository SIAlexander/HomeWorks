package pro.sky.java.course1.ObjectMethods;

public class Author {
    private final String NAME;

    public Author(String name){
        this.NAME = name;
    }

    public String getName(){
        return NAME;
    }

    public boolean equals(Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }
        Author author = (Author) other;
        return NAME.equals(author.NAME);
    }

    public int hashCode(){
        return java.util.Objects.hash(NAME);
    }

    public String toString(){
        return "Автор: " + this.NAME;
    }

}
