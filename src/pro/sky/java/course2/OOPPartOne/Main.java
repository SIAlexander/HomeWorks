package pro.sky.java.course2.OOPPartOne;

import pro.sky.java.course2.OOPPartOne.students.StudentGryffindor;
import pro.sky.java.course2.OOPPartOne.students.StudentHufflepuff;
import pro.sky.java.course2.OOPPartOne.students.StudentRavenclaw;
import pro.sky.java.course2.OOPPartOne.students.StudentSlytherin;

public class Main {
    public static void main(String[] args){

        //Студенты факультета Гриффиндор
        StudentGryffindor harryPotter = new StudentGryffindor
                ("Гарри Поттер", 6, 9, 30, 45, 34);
        StudentGryffindor hermioneGranger = new StudentGryffindor
                ("Гермиона Грейнджер", 3, 5, 35, 32, 33);
        StudentGryffindor ronWeasley = new StudentGryffindor
                ("Рон Уизли", 2, 4, 67, 34, 20);

        //Студенты факультета Пуффендуй
        StudentHufflepuff zachariahSmith = new StudentHufflepuff
                ("Захария Смит", 2, 4, 56, 32, 31);
        StudentHufflepuff сedricDiggory = new StudentHufflepuff
                ("Седрик Диггори", 1, 3, 43, 31,46);
        StudentHufflepuff justinFinchFletchley = new StudentHufflepuff
                ("Джастин Финч-Флетчли", 4, 3, 36, 43, 21);

        //Студенты факультета Слизерина
        StudentSlytherin dracoMalfoy = new StudentSlytherin
                ("Драко Малфой", 4, 6, 47, 32, 10,15,14);
        StudentSlytherin grahamMontague = new StudentSlytherin
                ("Грэхэм Монтегю", 1, 4, 34, 45, 5,1,23);
        StudentSlytherin gregoryGoyle = new StudentSlytherin
                ("Грегори Гойл", 5, 3, 45, 44, 2,15,13);

        //Студенты факультета Когтеврана
        StudentRavenclaw zhouChang = new StudentRavenclaw
                ("Чжоу Чанг", 5, 4, 15, 33, 32,25);
        StudentRavenclaw padmaPatil = new StudentRavenclaw
                ("Падма Патил", 2, 4, 14, 15, 34,16);
        StudentRavenclaw marcusBelby = new StudentRavenclaw
                ("Маркус Белби", 6, 3, 53, 22, 17,7);


        ServiceStudents.comparisonOfTwoStudentsInHogwarts(justinFinchFletchley, zhouChang);
        System.out.println();
        ServiceStudents.comparisonOfTwoStudentsInGryffindor(harryPotter, hermioneGranger);
        System.out.println();
        ServiceStudents.comparisonOfTwoStudentsInHufflepuff(zachariahSmith, justinFinchFletchley);
        System.out.println();
        ServiceStudents.comparisonOfTwoStudentsInRavenclaw(padmaPatil, zhouChang);
        System.out.println();
        ServiceStudents.comparisonOfTwoStudentsInSlytherin(dracoMalfoy, gregoryGoyle);
        System.out.println();
        System.out.println(marcusBelby);
        System.out.println(gregoryGoyle);
        System.out.println(justinFinchFletchley);
        System.out.println(ronWeasley);
    }
}
