package pro.sky.java.course2.OOPPartTwo;

public interface ServiceStation {

    void check(Transport[] transports);

    void check(Car[] cars);

    void check(Truck[] trucks);

    void check(Bicycle[] bicycles);

    void checkEngine(Transport transports);

    void checkTrailer(Transport transports);

    void updateTyre(Transport transports);
}
