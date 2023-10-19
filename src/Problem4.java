import java.util.Arrays;
public class Problem4 {

    // Cea mai ieftina tastatura
    public static int findeBilligsteTastatur(int[] tastaturen) {
        if (tastaturen.length == 0) {
            return -1;
        }

        int billigste = tastaturen[0];
        for (int preis : tastaturen) {
            if (preis < billigste) {
                billigste = preis;
            }
        }
        return billigste;
    }
}