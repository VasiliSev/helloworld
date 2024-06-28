public class Ravenclaw extends Hogwarts{

    //Когтевран

    private int intellect; //ум
    private int sapience; //мудрость
    private int witness; //остроумие
    public int create; //творчество
    public Ravenclaw(String name, int magicPower, int transgressionDistance,
                     int intellect,
                     int sapience,
                     int witness,
                     int create) {
        super(name, magicPower, transgressionDistance);
        this.intellect = intellect;
        this.sapience = sapience;
        this.witness = witness;
        this.create = create;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public void setSapience(int sapience) {
        this.sapience = sapience;
    }

    public void setWitness(int witness) {
        this.witness = witness;
    }

    public void setCreate(int create) {
        this.create = create;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getSapience() {
        return sapience;
    }

    public int getWitness() {
        return witness;
    }

    public int getCreate() {
        return create;
    }
}
