package pro.sky.java.course2.OOPPartOne.students;

import pro.sky.java.course2.OOPPartOne.faculty.Gryffindor;

import java.util.Objects;

public class StudentGryffindor extends Gryffindor{
    private final String fullName;

    public StudentGryffindor(String fullName, int forceMagic,
                             int distanceTransgression, int noble, int honor, int bravery) {
        super(forceMagic, distanceTransgression, noble, honor, bravery);
        this.fullName = fullName;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGryffindor that = (StudentGryffindor) o;
        return Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }


    @Override
    public String toString() {
        return "Студент: " + fullName + ", сила магии: " + getForceMagic() + ", расстояние трансгресии: " + getDistanceTransgression() +
                ", благородство: " + getNoble() + ", честь: " + getHonor() + ", храбрость: " + getBravery();
    }
}
