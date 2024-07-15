public class Truck extends Vehicle { //Реализация принципа наследования
    public Truck(String modelName, int wheelsCounts) {
        super(modelName, wheelsCounts);
    }

    @Override
    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем " + (i + 1) + " покрышку грузовика " + getModelName());
        }
        System.out.println("Поднимаем кабину и проверяем двигатель грузовика " + getModelName());
        System.out.println("Проверяем прицеп грузовика " + getModelName());
    }
}

