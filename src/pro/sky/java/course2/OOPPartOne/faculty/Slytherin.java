package pro.sky.java.course2.OOPPartOne.faculty;

import pro.sky.java.course2.OOPPartOne.Hogwarts;

public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(int forceMagic, int distanceTransgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(forceMagic, distanceTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public int sumScoreStudentSlytherin(){
        int sum = getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getLustForPower();
        return sum;
    }
}
