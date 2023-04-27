package pro.sky.java.course2.OOPPartTwo;

public class Car extends Transport {

    public Car(String modelName) {
        super(modelName);
    }

    @Override
    public int getWheelsCount() {
        return 4;
    }
}
