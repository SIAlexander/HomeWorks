package pro.sky.java.course2.OOPPartTwo;

public class Main {
    public static void main(String[] args){

        Car[] cars = {
                new Car("car1",4),
                new Car("car2", 4)
        };

        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2",8)
        };

        Bicycle[] bicycles = {
                new Bicycle("bicycle1",2),
                new Bicycle("bicycle2",2)
        };

        ServiceStation station = new ServiceStationForTransport();
        printStation(station, cars, trucks, bicycles);
    }

    private static void printStation(ServiceStation serviceStation, Car[] cars, Truck[] trucks, Bicycle[] bicycles) {
        serviceStation.check(cars);
        serviceStation.check(trucks);
        serviceStation.check(bicycles);
    }
}
