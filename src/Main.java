import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("car 1", 4);
        Car car2 = new Car("car 2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck 2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.checkVehicle(car, truck2, bicycle, car2, truck, bicycle2);

    }
}





