public class Hufflepuff extends Hogwarts{

    // Пуффендуй

    private int hardWork; //трудолюбие
    private int loyalty; //верность
    private int honesty; //честность
    public Hufflepuff(String name, int magicPower, int transgressionDistance,
                      int hardWork,
                      int loyalty,
                      int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
