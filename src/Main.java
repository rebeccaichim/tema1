import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] noten = {84, 29, 65, 38, 42};
        int[] nichtAusreichende = Problem1.nichtAusreichendeNoten(noten);

        System.out.print("Notele 'nicht ausreichend' sunt: ");
        for (int note : nichtAusreichende) {
            System.out.print(note + " ");
        }
        System.out.println();



        double durchschnitt = Problem1.berechneDurchschnitt(noten);
        System.out.println("Media notelor este: " + durchschnitt);



        int[] abgerundete = Problem1.abgerundeteNoten(noten);
        System.out.print("Notele abgerundete sunt: ");
        for (int note : abgerundete) {
            System.out.print(note + " ");
        }
        System.out.println();

    }

}



