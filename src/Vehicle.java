public abstract class Vehicle {
    private String modelName;
    private int wheelsCount;


    public Vehicle(String modelName, int wheelCounts) {
        this.modelName = modelName;
        this.wheelsCount = wheelCounts;
    }

    //реализация принципа инкапсуляции
    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public static void updateTyre() {
        System.out.println("Меняем покрышку");
    }


}