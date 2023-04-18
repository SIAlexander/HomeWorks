package pro.sky.java.course2.OOPPartOne;

import pro.sky.java.course2.OOPPartOne.students.StudentGryffindor;
import pro.sky.java.course2.OOPPartOne.students.StudentHufflepuff;
import pro.sky.java.course2.OOPPartOne.students.StudentRavenclaw;
import pro.sky.java.course2.OOPPartOne.students.StudentSlytherin;

public class ServiceStudents {

    public static void comparisonOfTwoStudentsInHogwarts(Hogwarts oneStudent, Hogwarts twoStudent){
        if (oneStudent.getDistanceTransgression() > twoStudent.getDistanceTransgression() ||
                oneStudent.getForceMagic() > twoStudent.getForceMagic()){
            if(oneStudent.getDistanceTransgression() > oneStudent.getDistanceTransgression()){
                System.out.println(oneStudent.getFullName() +
                        " обладает большей мощностью трансгрессии, чем " + twoStudent.getFullName());
            }else if (oneStudent.getForceMagic() > twoStudent.getForceMagic()){
                System.out.println(oneStudent.getFullName() +
                        " обладает большей мощностью магии, чем " + twoStudent.getFullName());
            }
        } else if (oneStudent.getDistanceTransgression() < twoStudent.getDistanceTransgression() ||
                oneStudent.getForceMagic() < twoStudent.getForceMagic()) {
            if(oneStudent.getDistanceTransgression() < oneStudent.getDistanceTransgression()){
                System.out.println(twoStudent +
                        " обладает большей мощностью трансгрессии, чем " + oneStudent.getFullName());
            }else if (oneStudent.getForceMagic() < twoStudent.getForceMagic()){
                System.out.println(twoStudent.getFullName() +
                        " обладает большей мощностью магии, чем " + oneStudent.getFullName());
            }
        }else{
            System.out.println("Студенты равны");
        }
    }

    public static void comparisonOfTwoStudentsInGryffindor(StudentGryffindor studentOne, StudentGryffindor studentTwo){
        int scoresStudentOne = studentOne.sumScoreStudentGryffindor();
        int scoresStudentTwo = studentTwo.sumScoreStudentGryffindor();

        if (scoresStudentOne > scoresStudentTwo){
            System.out.println(studentOne.getFullName() + " лучший Гриффиндорец, чем " + studentTwo.getFullName());
        }else if (scoresStudentOne < scoresStudentTwo){
            System.out.println(studentTwo.getFullName() + " лучший Гриффиндорец, чем " + studentOne.getFullName());
        }else{
            System.out.println("Студенты равны");
        }
    }

    public static void comparisonOfTwoStudentsInHufflepuff(StudentHufflepuff studentOne, StudentHufflepuff studentTwo){
        int scoresStudentOne = studentOne.sumScoreStudentHufflepuff();
        int scoresStudentTwo = studentTwo.sumScoreStudentHufflepuff();

        if (scoresStudentOne > scoresStudentTwo){
            System.out.println(studentOne.getFullName() + " лучший Пуффендуец, чем " + studentTwo.getFullName());
        }else if (scoresStudentOne < scoresStudentTwo){
            System.out.println(studentTwo.getFullName() + " лучший Пуффендуец, чем " + studentOne.getFullName());
        }else{
            System.out.println("Студенты равны");
        }
    }

    public static void comparisonOfTwoStudentsInRavenclaw(StudentRavenclaw studentOne, StudentRavenclaw studentTwo){
        int scoresStudentOne = studentOne.sumScoreStudentRavenclaw();
        int scoresStudentTwo = studentTwo.sumScoreStudentRavenclaw();

        if (scoresStudentOne > scoresStudentTwo){
            System.out.println(studentOne.getFullName() + " лучший Когтевранец, чем " + studentTwo.getFullName());
        }else if (scoresStudentOne < scoresStudentTwo){
            System.out.println(studentTwo.getFullName() + " лучший Когтевранец, чем " + studentOne.getFullName());
        }else{
            System.out.println("Студенты равны");
        }
    }

    public static void comparisonOfTwoStudentsInSlytherin(StudentSlytherin studentOne, StudentSlytherin studentTwo){
        int scoresStudentOne = studentOne.sumScoreStudentSlytherin();
        int scoresStudentTwo = studentTwo.sumScoreStudentSlytherin();

        if (scoresStudentOne > scoresStudentTwo){
            System.out.println(studentOne.getFullName() + " лучший Слизеринец, чем " + studentTwo.getFullName());
        }else if (scoresStudentOne < scoresStudentTwo){
            System.out.println(studentTwo.getFullName() + " лучший Слизеринец, чем " + studentOne.getFullName());
        }else{
            System.out.println("Студенты равны");
        }
    }
}
