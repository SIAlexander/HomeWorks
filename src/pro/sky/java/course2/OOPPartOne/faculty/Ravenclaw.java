package pro.sky.java.course2.OOPPartOne.faculty;

import pro.sky.java.course2.OOPPartOne.Hogwarts;

public class Ravenclaw extends Hogwarts {
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(int forceMagic, int distanceTransgression, int mind, int wisdom, int wit, int creativity) {
        super(forceMagic, distanceTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public int sumScoreStudentRavenclaw(){
        int sum = getMind() + getWisdom() + getWit() + getCreativity();
        return sum;
    }
}
