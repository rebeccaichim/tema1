import java.util.Arrays;

public class Problem3 {
    // Suma numerelor ca array
    public static int[] berechneSumme(int[] zahl1, int[] zahl2) {
        int n = Math.max(zahl1.length, zahl2.length);
        int carry = 0;
        int[] summe = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int digit1 = i < zahl1.length ? zahl1[i] : 0;
            int digit2 = i < zahl2.length ? zahl2[i] : 0;
            int tempSumme = digit1 + digit2 + carry;
            summe[i] = tempSumme % 10;
            carry = tempSumme / 10;
        }
        if (carry > 0) {
            int[] neueSumme = new int[n + 1];
            neueSumme[0] = carry;
            System.arraycopy(summe, 0, neueSumme, 1, n);
            return neueSumme;
        }
        return summe;
    }

    // Diferenta numerelor ca array
    public static int[] berechneDifferenz(int[] zahl1, int[] zahl2) {
        int n = zahl1.length;
        int borrow = 0;
        int[] differenz = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int tempDifferenz = zahl1[i] - zahl2[i] - borrow;
            if (tempDifferenz < 0) {
                tempDifferenz += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            differenz[i] = tempDifferenz;
        }
        return differenz;
    }

    // Inmultirea unui numar cu cifra
    public static int[] berechneMultiplikation(int[] zahl1, int ziffer) {
        int n = zahl1.length;
        int carry = 0;
        int[] produkt = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int tempProdukt = zahl1[i] * ziffer + carry;
            produkt[i] = tempProdukt % 10;
            carry = tempProdukt / 10;
        }
        if (carry > 0) {
            int[] neuesProdukt = new int[n + 1];
            neuesProdukt[0] = carry;
            for (int i = 1; i <= n; i++) {
                neuesProdukt[i] = produkt[i - 1];
            }
            return neuesProdukt;
        }
        return produkt;
    }

    // Impartirea unui numar la cifra
    public static int[] berechneDivision(int[] zahl1, int ziffer) {
        int n = zahl1.length;
        int[] quotient = new int[n];
        int remainder = 0;
        for (int i = 0; i < n; i++) {
            int tempDivision = zahl1[i] + remainder * 10;
            quotient[i] = tempDivision / ziffer;
            remainder = tempDivision % ziffer;
        }
        return quotient;

    }
}