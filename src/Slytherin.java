public class Slytherin extends Hogwarts {

    //Слизерин

    private int cunning; //хитрость
    private int resolve; //решительность
    private int ambition; //амбициозность
    private int inventiveness; //находчивость
    private int lustForPower; //жажда власти

    public Slytherin(String name, int magicPower, int transgressionDistance,
                     int cunning,
                     int resolve,
                     int ambition,
                     int inventiveness,
                     int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.resolve = resolve;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.lustForPower = lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setInventiveness(int inventiveness) {
        this.inventiveness = inventiveness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getResolve() {
        return resolve;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getInventiveness() {
        return inventiveness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
}
