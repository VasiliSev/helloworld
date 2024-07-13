import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("car 1", 4);
        Car car2 = new Car("car 2", 4);

        car.setModelName("Toyota");//чтобы геттеры и сеттеры
        car2.setWheelsCount(5);     //зря не пропадали

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck 2", 8);
        truck.setModelName("Caterpillar");
        truck2.setWheelsCount(12);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        bicycle.setModelName("Stels");
        bicycle2.setWheelsCount(3);

        ServiceStation station = new ServiceStation();
        station.checkVehicle(car);
        station.checkVehicle(car2);
        station.checkVehicle(bicycle);
        station.checkVehicle(bicycle2);
        station.checkVehicle(truck);
        station.checkVehicle(truck2);
    }
}





