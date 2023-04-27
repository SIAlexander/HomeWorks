package pro.sky.java.course2.OOPPartTwo;

public class Bicycle extends Transport {

    public Bicycle(String modelName) {
        super(modelName);
    }

    @Override
    public int getWheelsCount() {
        return 2;
    }
}
