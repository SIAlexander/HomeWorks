package pro.sky.java.course2.OOPPartTwo;

public class ServiceStationForTransport implements ServiceStation {

    private void printTransport(Transport transports){
        System.out.println("Обслуживаем " + transports.getModelName());
        for (int i = 0; i < transports.getWheelsCount(); i++) {
            transports.updateTyre();
        }
    }

    @Override
    public void check(Car[] car) {
        for (Car value : car) {
            printTransport(value);
            value.checkEngine();
            System.out.println();
        }
    }

    @Override
    public void check(Truck[] truck){
        for (Truck value : truck) {
            printTransport(value);
            value.checkEngine();
            value.checkTrailer();
            System.out.println();
        }
    }

    @Override
    public void check(Bicycle[] bicycle){
        for (Bicycle value : bicycle) {
            printTransport(value);
            System.out.println();
        }
    }
}
