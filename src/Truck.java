public class Truck extends Vehicle { //Реализация принципа наследования
    public Truck(String modelName, int wheelsCounts) {
        super(modelName, wheelsCounts);
    }
    public static void checkEngineTruck() {
        System.out.println("Проверяем двигатель грузовика");
    }
    public static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
