package pro.sky.java.course1.ObjectsAndClasses;

public class Main {
    public static void main(String[] args){
        Author authorPushkin = new Author("Александр","Пушкин");
        Author authorLermontov = new Author("Михаил","Лермонтов");

        Book eugeneOnegin = new Book("Евгений Онегин",1833, authorPushkin);
        Book theHeroOfOurTime = new Book("Герой нашего времени", 1838, authorLermontov);

        System.out.println(authorPushkin.getName() + " " + authorPushkin.getSurname()
                + " - " + eugeneOnegin.getTitleBook() + " - " + eugeneOnegin.getYearOfPublication());

        System.out.println(authorLermontov.getName() + " " + authorLermontov.getSurname()
                + " - " + theHeroOfOurTime.getTitleBook() + " - " + theHeroOfOurTime.getYearOfPublication());

        System.out.println("_______________________________________________");

        theHeroOfOurTime.setYearOfPublication(1900);
        eugeneOnegin.setYearOfPublication(1950);
        System.out.println(authorPushkin.getName() + " " + authorPushkin.getSurname()
                + " - " + eugeneOnegin.getTitleBook() + " - " + eugeneOnegin.getYearOfPublication());

        System.out.println(authorLermontov.getName() + " " + authorLermontov.getSurname()
                + " - " + theHeroOfOurTime.getTitleBook() + " - " + theHeroOfOurTime.getYearOfPublication());
    }
}
