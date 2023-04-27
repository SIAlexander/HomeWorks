package pro.sky.java.course2.OOPPartTwo;

public class ServiceStationForTransport implements ServiceStation {

    @Override
    public void check(Transport[] transports) {
        for (Transport transport : transports) {
            if (transport.getWheelsCount() == 2) {
                printModelName(transport);
                updateTyre(transport);
            } else if (transport.getWheelsCount() == 4) {
                printModelName(transport);
                updateTyre(transport);
                checkEngine(transport);
            } else if (transport.getWheelsCount() % 2 == 0 && transport.getWheelsCount() >= 6) {
                printModelName(transport);
                updateTyre(transport);
                checkEngine(transport);
                checkTrailer(transport);
            }
        }
    }

    @Override
    public void check(Car[] cars){
        for (Car car : cars) {
            if (car.getWheelsCount() == 4) {
                printModelName(car);
                updateTyre(car);
                checkEngine(car);
            }
        }
    }

    @Override
    public void check(Truck[] trucks){
        for (Truck truck : trucks) {
            if (truck.getWheelsCount() % 2 == 0 && truck.getWheelsCount() >= 6) {
                printModelName(truck);
                updateTyre(truck);
                checkEngine(truck);
                checkTrailer(truck);
            }
        }
    }

    @Override
    public void check(Bicycle[] bicycles){
        for (Bicycle bicycle : bicycles) {
            if (bicycle.getWheelsCount() == 2) {
                printModelName(bicycle);
                updateTyre(bicycle);
            }
        }
    }

    @Override
    public void updateTyre(Transport transports) {
        for (int i = 0; i < transports.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void checkEngine(Transport transports) {
            System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer(Transport transports) {
            System.out.println("Проверяем прицеп");
    }

    private void printModelName(Transport transport){
        System.out.println("Обслуживаем: " + transport);
    }
}
