public class Car extends Vehicle { //Реализация принципа наследования
    public Car(String modelName, int wheelsCounts) {
        super(modelName, wheelsCounts);
    }

    @Override
    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем " + (i + 1) + " покрышку легкового автомобиля " + getModelName());
        }
        System.out.println("Проверяем двигатель легкового автомобиля " + getModelName());
    }
}


