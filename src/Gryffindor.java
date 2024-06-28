public class Gryffindor extends Hogwarts {

    //Гриффиндор

    private int nobility; //благородство
    private int honor; //честь
    private int bravery; //храбрость

    public Gryffindor(String name, int magicPower, int transgressionDistance,
                      int nobility,
                      int honor,
                      int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
