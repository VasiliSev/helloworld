public class ServiceStation {
    //принцип перегрузки методов
    public void checkVehicle(Vehicle vehicle) {
        if (vehicle.getWheelsCount() > 3 || vehicle.getWheelsCount() <= 4) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                Vehicle.updateTyre();
            }
            Car.checkEngine();
        } else if (vehicle.getWheelsCount() > 4) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                Vehicle.updateTyre();
            }
            Car.checkEngine();
            Truck.checkTrailer();
        } else if (vehicle.getWheelsCount() == 2) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                Vehicle.updateTyre();
            }
        }
    }
}



