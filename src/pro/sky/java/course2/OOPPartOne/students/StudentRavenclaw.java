package pro.sky.java.course2.OOPPartOne.students;

import pro.sky.java.course2.OOPPartOne.faculty.Ravenclaw;

import java.util.Objects;

public class StudentRavenclaw extends Ravenclaw {
    private final String fullName;

    public StudentRavenclaw(String fullName, int forceMagic, int distanceTransgression, int mind, int wisdom, int wit, int creativity) {
        super(forceMagic, distanceTransgression, mind, wisdom, wit, creativity);
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
        StudentRavenclaw that = (StudentRavenclaw) o;
        return Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return "Студент: " + fullName + ", сила магии: " + getForceMagic() +
                ", расстояние трансгресии: " + getDistanceTransgression() +
                ", ум: " + getMind() + ", мудрость: " + getWisdom() +
                ", остроумие: " + getWit() + ", творчество: " + getCreativity();
    }
}
