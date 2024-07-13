public class Car extends Vehicle{ //Реализация принципа наследования
public Car(String modelName, int wheelsCounts){
    super(modelName, wheelsCounts);
}
    public static void checkEngineCar() {
        System.out.println("Проверяем двигатель легкового автомобиля");
    }
}

