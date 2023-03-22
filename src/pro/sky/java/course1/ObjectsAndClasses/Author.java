package pro.sky.java.course1.ObjectsAndClasses;

public class Author {
    private final String NAME;
    private final String SURNAME;

    public Author(String name, String surname){
        this.NAME = name;
        this.SURNAME = surname;
    }

    public String getName(){
        return NAME;
    }
    public String getSurname(){
        return SURNAME;
    }
}
