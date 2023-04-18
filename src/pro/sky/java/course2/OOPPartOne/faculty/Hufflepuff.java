package pro.sky.java.course2.OOPPartOne.faculty;

import pro.sky.java.course2.OOPPartOne.Hogwarts;

public class Hufflepuff extends Hogwarts {
    private final int industriousness;
    private final int fidelity;
    private final int honesty;

    public Hufflepuff(int forceMagic, int distanceTransgression, int industriousness, int fidelity, int honesty) {
        super(forceMagic, distanceTransgression);
        this.industriousness = industriousness;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getFidelity() {
        return fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    public int sumScoreStudentHufflepuff(){
        int sum = getIndustriousness() + getFidelity() + getHonesty();
        return sum;
    }
}
