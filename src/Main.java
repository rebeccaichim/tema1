import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        // 1
        int[] noten = {84, 29, 65, 38, 42};

        // 1.1: Notele "nicht ausreichend"
        int[] nichtAusreichende = Problem1.nichtAusreichendeNoten(noten);
        System.out.print("Notele 'nicht ausreichend' sunt: ");
        for (int note : nichtAusreichende) {
            System.out.print(note + " ");
        }
        System.out.println();

        // 1.2: Media notelor
        double durchschnitt = Problem1.berechneDurchschnitt(noten);
        System.out.println("Media notelor este: " + durchschnitt);

        // 1.3: Notele abgerundete
        int[] abgerundete = Problem1.abgerundeteNoten(noten);
        System.out.print("Notele abgerundete sunt: ");
        for (int note : abgerundete) {
            System.out.print(note + " ");
        }
        System.out.println();

        // 1.4: Nota maxima abgerundete
        int maxAbgerundete = Problem1.maxAbgerundeteNote(noten);
        System.out.println("Nota maxima abgerundete este: " + maxAbgerundete);


        // 2
        int[] zahlen = {4, 8, 3, 10, 17};

        // 2.1: Numarul maxim
        int maxZahl = Problem2.findeMaximaleZahl(zahlen);
        System.out.println("Maximale Zahl: " + maxZahl);

        // 2.2: Numarul minim
        int minZahl = Problem2.findeMinimaleZahl(zahlen);
        System.out.println("Minimale Zahl: " + minZahl);

        // 2.3: Suma maxima cu n-1 numere
        int maxSumme = Problem2.findeMaximaleSumme(zahlen);
        System.out.println("Maximale Summe von n-1 Zahlen: " + maxSumme);

        // 2.4: Suma minima cu n-1 numere
        int minSumme = Problem2.findeMinimaleSumme(zahlen);
        System.out.println("Minimale Summe von n-1 Zahlen: " + minSumme);

        // 3
        int[] großeZahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] großeZahl2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        // 3.1
        int[] summe = Problem3.berechneSumme(großeZahl1, großeZahl2);
        System.out.println("Summe der großen Zahlen: " + Arrays.toString(summe));

        // 3.2
        int[] differenz = Problem3.berechneDifferenz(großeZahl1, großeZahl2);
        System.out.println("Differenz der großen Zahlen: " + Arrays.toString(differenz));

        // 3.3
        int[] multiplikation = Problem3.berechneMultiplikation(großeZahl1, 2);
        System.out.println("Multiplikation der großen Zahl: " + Arrays.toString(multiplikation));

        // 3.4
        int[] division = Problem3.berechneDivision(großeZahl1, 2);
        System.out.println("Division der großen Zahl: " + Arrays.toString(division));

    }

}



