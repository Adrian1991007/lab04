package ro.usv.magazin;

import ro.usv.cutii.ICutie;
import ro.usv.jucarii.Jucarie;
import ro.usv.jucarii.Minge;

import java.util.Objects;

public class Pachet {
    Jucarie jucarie;
    boolean cereCutie;
    boolean cerePanglica;
    ICutie cutie;
    double lungPanglica;

    public Pachet(Jucarie jucarie, boolean cereCutie, boolean cerePanglica) {
        this.jucarie = jucarie;
        this.cereCutie = cereCutie;
        this.cerePanglica = cerePanglica;
        cutie = FabricaCutii.getCutie(jucarie);
        lungPanglica = cutie.getLungimePanglica();
    }


    public double pretPachet() {
        return jucarie.getPret() + (cereCutie ? cutie.pret() : 0) + (cerePanglica ? RolaPanglica.getPret(cutie) : 0);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if(cereCutie)
        {
            stringBuilder.append(", impachetat in ").append(cutie);
            if(cerePanglica)
            {
                stringBuilder.append(", lungPanglica=").append(lungPanglica);
            }
        }

        return "Pachet{" +
                "jucarie=" + jucarie + stringBuilder;
    }

    public static void main(String[] args) {
        System.out.println("\n===== Demo Pachet (1p) =====");
        Pachet p1 = new Pachet(new Minge(10), true, true);
        System.out.println(p1);
        System.out.println("Pret="+p1.pretPachet());
    }


}
