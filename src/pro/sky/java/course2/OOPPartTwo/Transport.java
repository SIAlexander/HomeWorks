package pro.sky.java.course2.OOPPartTwo;

public class Transport {

    private final String modelName;
    private int wheelsCount;

    public Transport(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return modelName;
    }
}
