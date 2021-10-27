package ro.usv.cutii;

public class Paralelipiped implements ICutie {
    private final double l;
    private final double L;
    private final double h;

    public Paralelipiped(double l, double l1, double h) {
        this.l = l;
        this.L = l1;
        this.h = h;
    }

    @Override
    public double getSuprafataTotala() {
        return 2 * l * L + 2 * L * h + 2 * l * h;
    }

    @Override
    public double getLungimePanglica() {
        return (2 * (L + h) + 2 * (l + L)) + lnod;
    }

    @Override
    public String toString() {
        return "Cutie - Paralelipiped" +
                "{l=" + l +
                ", L=" + L +
                ", h=" + h +
                '}';
    }

    @Override
    public double pret() {
        return ICutie.super.pret();
    }
}
