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

    }
}



