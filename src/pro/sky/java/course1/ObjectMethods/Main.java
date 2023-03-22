package pro.sky.java.course1.ObjectMethods;

public class Main {
    public static void main(String[] args){
        Author authorPushkin = new Author("Александр Пушкин");
        Author authorPushkin1 = new Author("Александр Пушкин");
        System.out.println(authorPushkin.equals(authorPushkin1));

        Book bookOnegin = new Book("Евгений Онегин", 1833, authorPushkin);
        Book bookOnegin1 = new Book("Евгений Онегин", 1833, authorPushkin);
        System.out.println(bookOnegin.equals(bookOnegin1));

        System.out.println(bookOnegin);
        bookOnegin.setYearOfPublication(1900);
        System.out.println(bookOnegin);


    }
}
