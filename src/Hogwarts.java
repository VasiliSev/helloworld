public class Hogwarts {

    private int magicPower;
    private int transgressionDistance;
    private String name;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return this.name;
    }

    public int getMagicPower() {
        return this.magicPower;
    }

    public int getTransgressionDistance() {
        return this.transgressionDistance;
    }
}
