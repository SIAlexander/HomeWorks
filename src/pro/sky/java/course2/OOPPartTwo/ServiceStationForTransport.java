package pro.sky.java.course2.OOPPartTwo;

public class ServiceStationForTransport implements ServiceStation {

    @Override
    public void check(Transport[] transports) {
        for (Transport transport : transports) {
            if (transport instanceof Bicycle) {
                printModelName(transport);
                updateTyre(transport);
                System.out.println();
            } else if (transport instanceof Car) {
                printModelName(transport);
                updateTyre(transport);
                checkEngine(transport);
                System.out.println();
            } else if (transport instanceof Truck) {
                printModelName(transport);
                updateTyre(transport);
                checkEngine(transport);
                checkTrailer(transport);
                System.out.println();
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
