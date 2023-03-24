package pro.sky.java.course1.ObjectMethods;

public class Main {
    public static void main(String[] args){
        Author authorPushkin = new Author("Александр", "Пушкин");
        Author authorPushkin1 = new Author("Александр", "Пушкин");

        //проверка equals()
        System.out.println(authorPushkin.equals(authorPushkin1));
        //проверка hashCode()
        System.out.println(authorPushkin.hashCode());
        System.out.println(authorPushkin1.hashCode());

        Book bookOnegin = new Book("Евгений Онегин", 1833, authorPushkin);
        Book bookOnegin1 = new Book("Евгений Онегин", 1833, authorPushkin);

        //проверка equals()
        System.out.println(bookOnegin.equals(bookOnegin1));
        //проверка hashCode()
        System.out.println(bookOnegin.hashCode());
        System.out.println(bookOnegin1.hashCode());

        //проверка setYearOfPublication()
        System.out.println(bookOnegin);
        bookOnegin.setYearOfPublication(1900);
        System.out.println(bookOnegin);
    }
}
