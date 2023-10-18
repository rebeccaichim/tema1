import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static int[] nichtAusreichendeNoten(int[] noten) {
        int count = 0;
        for (int note : noten) {
            if (note < 0 || note > 100) {
                System.out.println("Die Note soll zwischen 0 und 100 sein.");
            }
            if (note < 40) {
                count++;
            }
        }
        int[] nichtAusreichende = new int[count];
        int index = 0;
        for (int note : noten) {
            if (note < 40) {
                nichtAusreichende[index] = note;
                index++;
            }
        }
        return nichtAusreichende;
    }
    public static double berechneDurchschnitt(int[] noten) {
        if (noten.length == 0) {
            return 0;
        }

        int summe = 0;
        for (int note : noten) {
            summe += note;
        }

        return (double) summe / noten.length;
    }

}