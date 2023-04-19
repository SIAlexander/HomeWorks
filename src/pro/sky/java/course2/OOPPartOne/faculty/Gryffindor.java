package pro.sky.java.course2.OOPPartOne.faculty;

import pro.sky.java.course2.OOPPartOne.Hogwarts;

public class Gryffindor extends Hogwarts {
    private final int noble;
    private final int honor;
    private final int bravery;

    public Gryffindor(int forceMagic, int distanceTransgression, int noble, int honor, int bravery) {
        super(forceMagic, distanceTransgression);
        this.noble = noble;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNoble() {
        return noble;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int sumScoreStudentGryffindor(){
        int sum = getNoble() + getHonor() + getBravery();
        return sum;
    }
}
