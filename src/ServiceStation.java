public class ServiceStation {
    public void checkVehicle(Vehicle... vehicle) {
        for (Vehicle v : vehicle) {
            v.service();
        }
    }
}



