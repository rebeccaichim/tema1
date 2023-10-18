import java.util.ArrayList;
import java.util.List;

public class Problem1 {

    // Array cu notele insuficiente (<40)
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

    // 2. Media notelor
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

    // 3. Array cu toate notele rotunjite
    public static int[] abgerundeteNoten(int[] noten) {
        int[] abgerundeteArray = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            int note = noten[i];
            if (note < 38) {
                abgerundeteArray[i] = note;
            } else {
                int remainder = note % 5;
                if (remainder >= 3) {
                    abgerundeteArray[i] = note + (5 - remainder);
                } else {
                    abgerundeteArray[i] = note;
                }
            }
        }
        return abgerundeteArray;
    }

    // 4. Nota maxima rotunjita
    public static int maxAbgerundeteNote(int[] noten) {
        int maxAbgerundete = -1;
        for (int note : noten) {
            int abgerundeteNote = abgerundeteNoten(new int[] {note})[0];
            if (abgerundeteNote > maxAbgerundete) {
                maxAbgerundete = abgerundeteNote;
            }
        }
        return maxAbgerundete;
    }
}
