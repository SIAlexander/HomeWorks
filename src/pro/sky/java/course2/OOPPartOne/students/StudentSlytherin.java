package pro.sky.java.course2.OOPPartOne.students;

import pro.sky.java.course2.OOPPartOne.faculty.Slytherin;

import java.util.Objects;

public class StudentSlytherin extends Slytherin {
    private final String fullName;

    public StudentSlytherin(String fullName, int forceMagic, int distanceTransgression, int cunning,
                            int determination, int ambition, int resourcefulness, int lustForPower) {
        super(forceMagic, distanceTransgression, cunning, determination, ambition, resourcefulness, lustForPower);
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
        StudentSlytherin that = (StudentSlytherin) o;
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
                ", хитрость: " + getCunning() + ", решительность: " + getDetermination() +
                ", амбициозность: " + getAmbition() + ", находчивость: " + getResourcefulness() +
                ", жажда власти: " + getLustForPower() ;
    }
}
