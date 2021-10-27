package ro.usv.magazin;

import ro.usv.cutii.*;
import ro.usv.jucarii.Jucarie;
import java.util.Arrays;

public class FabricaCutii{
    public static ICutie getCutie(Jucarie jucarie)
    {
        double[] dim = jucarie.getDimensiuni();
        double[] filteredArray = Arrays.stream(dim).filter(num -> num != 0).toArray();
        switch (filteredArray.length)
        {
            case 1 -> {
                return new Cub(filteredArray[0]);
            }
            case 2 -> {
                return new Cilindru(filteredArray[0], filteredArray[1]);
            }
            case 3 -> {
                return new Paralelipiped(filteredArray[0], filteredArray[1], filteredArray[2]);
            }
            default -> throw new IllegalStateException("Unexpected value: " + jucarie.getDimensiuni().length);
        }
    }

}
