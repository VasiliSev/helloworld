public class ServiceStation {
    //принцип перегрузки методов
    public void checkVehicle(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();//принцип полиморфизма - метод взят из родительского класса
        }
        car.checkEngine();
    }

    public void checkVehicle(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

    public void checkVehicle(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            checkVehicle(car);
        } else if (truck != null) {
            checkVehicle(truck);
        } else if (bicycle != null) {
            checkVehicle(bicycle);
        }
     }
}
