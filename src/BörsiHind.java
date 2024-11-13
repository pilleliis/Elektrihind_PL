import java.time.LocalDate;

public class BörsiHind {
    private String kuupäev;
    private int tund;
    private double hind;


    public BörsiHind(String kuupäev, int tund, double hind) {
        this.kuupäev = kuupäev;
        this.hind = hind;
        this.tund = tund;
    }

    @Override
    public String toString() {
        return "BörsiHind{" +
                "kuupäev=" + kuupäev +
                ", tund=" + tund +
                ", hind=" + hind +
                '}';
    }
}
