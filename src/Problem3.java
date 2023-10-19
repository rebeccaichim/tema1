import java.util.Arrays;

public class Problem3 {
    public static int[] berechneSumme(int[] zahl1, int[] zahl2) {
        int n = zahl1.length;
        int carry = 0;
        int[] summe = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int tempSumme = zahl1[i] + zahl2[i] + carry;
            summe[i] = tempSumme % 10;
            carry = tempSumme / 10;
        }
        if (carry > 0) {
            int[] neueSumme = new int[n + 1];
            neueSumme[0] = carry;
            for (int i = 1; i <= n; i++) {
                neueSumme[i] = summe[i - 1];
            }
            return neueSumme;
        }
        return summe;
    }

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
}