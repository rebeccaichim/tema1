public class Problem2 {
    public static int findeMaximaleZahl(int[] zahlen) {
        int max = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl > max) {
                max = zahl;
            }
        }
        return max;
    }

    public static int findeMinimaleZahl(int[] zahlen) {
        int min = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl < min) {
                min = zahl;
            }
        }
        return min;
    }
    public static int findeMaximaleSumme(int[] zahlen) {
        int summe = 0;
        int min = zahlen[0];
        for (int zahl : zahlen) {
            summe += zahl;
            if (zahl < min) {
                min = zahl;
            }
        }
        return summe - min;
    }
    public static int findeMinimaleSumme(int[] zahlen) {
        int summe = 0;
        int max = -1;
        for (int zahl : zahlen) {
            summe += zahl;
            if (zahl > max) {
                max = zahl;
            }
        }
        return summe - max;
    }
}
