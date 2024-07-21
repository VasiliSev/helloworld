public class Bicycle extends Vehicle { //Реализация принципа наследования
    public Bicycle(String modelName, int wheelsCounts) {
        super(modelName, wheelsCounts);
    }

    @Override
    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем " + (i + 1) + " покрышку велосипеда " + getModelName());
        }
    }
}

