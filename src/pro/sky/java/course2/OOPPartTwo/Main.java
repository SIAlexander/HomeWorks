package pro.sky.java.course2.OOPPartTwo;

public class Main {
    public static void main(String[] args){

        Car[] cars = {
                new Car("car1"),
                new Car("car2")
        };

        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2",8)
        };

        Bicycle[] bicycles = {
                new Bicycle("bicycle1"),
                new Bicycle("bicycle2")
        };

        Transport[] transports = new Transport[cars.length + trucks.length + bicycles.length];
        for (int i = 0; i < cars.length; i++) {
            transports[i] = cars[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            transports[i + cars.length] = trucks[i];
        }
        for (int i = 0; i < bicycles.length; i++) {
            transports[i + cars.length + trucks.length] = bicycles[i];
        }

        ServiceStation station = new ServiceStationForTransport();
        station.check(transports);

        System.out.println();

        transportStation(station, cars, trucks, bicycles);

    }

    private static void transportStation(ServiceStation serviceStations, Car[] cars, Truck[] trucks, Bicycle[] bicycles){
        serviceStations.check(cars);
        serviceStations.check(trucks);
        serviceStations.check(bicycles);
    }
}
