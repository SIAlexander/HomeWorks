package pro.sky.java.course2.OOPPartOne.students;

import pro.sky.java.course2.OOPPartOne.faculty.Hufflepuff;

import java.util.Objects;

public class StudentHufflepuff extends Hufflepuff {
    private final String fullName;

    public StudentHufflepuff(String fullName, int forceMagic, int distanceTransgression, int industriousness, int fidelity, int honesty) {
        super(forceMagic, distanceTransgression, industriousness, fidelity, honesty);
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
        StudentHufflepuff that = (StudentHufflepuff) o;
        return Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return "Студент: " + fullName + ", сила магии: " + getForceMagic() + ", расстояние трансгресии: " + getDistanceTransgression() +
                ", трудолюбие: " + getIndustriousness() + ", верность: " + getFidelity() + ", честность: " + getHonesty();
    }
}
