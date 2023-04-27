package pro.sky.java.course2.OOPPartTwo;

public class Truck extends Transport{

    private final int wheelsCount;

    public Truck(String modelName, int wheelsCount ) {
        super(modelName);
        this.wheelsCount = wheelsCount;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }
}
