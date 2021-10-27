package ro.usv.magazin;

import ro.usv.cutii.ICutie;

public class RolaPanglica {
    private static final double costUnitateLungime = 0.01;
    private static double disponibil = 10000;

    public static String GetNecesarPanglica(ICutie cutie)
    {
        double Lungime = cutie.getLungimePanglica();
        if((disponibil - Lungime) < 0)
            getRola();
        if(Lungime <= disponibil)
        {
            StringBuilder stringBuilder = new StringBuilder();
            disponibil -= Lungime;
            stringBuilder.append("Pentru cutia:").append(cutie).append(" necesar lung_panglica=").append(Lungime);
            stringBuilder.append(" dupa cumparare:").append("{RolaPanglica, disponibil=").append(disponibil).append("}");
            return String.valueOf(stringBuilder);
        }
        else
            return "Nu mai este suficienta panglica pentru a ambala aceasta cutie";
    }

    public static double getPret(ICutie cutie)
    {
        return cutie.getLungimePanglica() * costUnitateLungime;
    }

    public static double getDisponibil() {
        return disponibil;
    }


    public static double getRola() {
        return getDisponibil();
    }

}
