public class Car extends Vehicle{ //Реализация принципа наследования
public Car(String modelName, int wheelsCounts){
    super(modelName, wheelsCounts);
}
    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

