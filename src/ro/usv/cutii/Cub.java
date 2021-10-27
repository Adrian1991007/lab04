package ro.usv.cutii;

public class Cub implements ICutie{
    private final double l;

    public Cub(double l) {
        this.l = l;
    }

    @Override
    public double getSuprafataTotala() {
        return 6 * Math.pow(l,2);
    }

    @Override
    public double getLungimePanglica() {
        return (2 * (2 * l) + 2 * (2 * l) ) + lnod;
    }

    @Override
    public String toString() {
        return "Cutie - Cub" +
                "{l=" + l +
                '}';
    }


    @Override
    public double pret() {
        return ICutie.super.pret();
    }
}
