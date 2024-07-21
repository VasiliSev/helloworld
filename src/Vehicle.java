public abstract class Vehicle {
    private final String modelName;
    private final int wheelsCount;


    public Vehicle(String modelName, int wheelCounts) {
        this.modelName = modelName;
        this.wheelsCount = wheelCounts;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public abstract void service();
}


