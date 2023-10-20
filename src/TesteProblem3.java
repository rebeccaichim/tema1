import java.util.Arrays;


public class TesteProblem3 {
    public void testBerechneSummeCorect() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {5, 6, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatAsteptat = {6, 9, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatObtinut = Problem3.berechneSumme(zahl1, zahl2);

        if (Arrays.equals(rezultatAsteptat, rezultatObtinut)) {
            System.out.println("summe a trecut");
        } else {
            System.err.println("summe a esuat");
        }
    }

    public static void testBerechneSummeNeasteptat() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {5, 6, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatAsteptat = {6, 8, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatObtinut = Problem3.berechneSumme(zahl1, zahl2);

        if (!Arrays.equals(rezultatAsteptat, rezultatObtinut)) {
            System.out.println("summe neasteptat a trecut");
        } else {
            System.err.println("summe neasteptat a esuat");
        }
    }

    public void testBerechneDifferenzCorect() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatAsteptat = {2, 6, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatObtinut = Problem3.berechneDifferenz(zahl1, zahl2);
        if (Arrays.equals(rezultatAsteptat, rezultatObtinut)) {
            System.out.println("differenz a trecut");
        } else {
            System.err.println("differenz a esuat");
        }
    }


    public static void testBerechneDifferenzNeasteptat() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {8, 6, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatAsteptat = {5, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatObtinut = Problem3.berechneDifferenz(zahl1, zahl2);

        if (!Arrays.equals(rezultatAsteptat, rezultatObtinut)) {
            System.out.println("differenz neasteptat a trecut");
        } else {
            System.err.println("differenz neasteptat a esuat");
        }
    }
    public void testBerechneMultiplikationCorect() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int ziffer = 2;
        int[] rezultatAsteptat = {2, 6, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatObtinut = Problem3.berechneMultiplikation(zahl1, ziffer);
        if (Arrays.equals(rezultatAsteptat, rezultatObtinut)) {
            System.out.println("multiplikation a trecut");
        } else {
            System.err.println("multiplikation a esuat");
        }
    }

    public void testBerechneMultiplikationNeasteptat() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int ziffer = 2;
        int[] rezultatAsteptat = {1, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatObtinut = Problem3.berechneMultiplikation(zahl1, ziffer);
        if (!Arrays.equals(rezultatAsteptat, rezultatObtinut)) {
            System.out.println("multiplikation neasteptat a trecut");
        } else {
            System.err.println("multiplikation neasteptat a esuat");
        }
    }

    public void testBerechneDivisionCorect() {
        int[] zahl1 = {2, 6, 0, 0, 0, 0, 0, 0, 0};
        int ziffer = 2;
        int[] rezultatAsteptat = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatObtinut = Problem3.berechneDivision(zahl1, ziffer);

        if (Arrays.equals(rezultatAsteptat, rezultatObtinut)) {
            System.out.println("division a trecut");
        } else {
            System.err.println("division a esuat");
        }
    }

    public void testBerechneDivisionNeasteptat() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int ziffer = 3;
        int[] rezultatAsteptat = {4, 3, 3, 3, 3, 3, 3, 3, 3};
        int[] rezultatObtinut = Problem3.berechneDivision(zahl1, ziffer);
        if (!Arrays.equals(rezultatAsteptat, rezultatObtinut)) {
            System.out.println("division neasteptat a trecut");
        } else {
            System.err.println("division neasteptat a esuat");
        }
    }

    public static void main(String[] args) {
        TesteProblem3 teste = new TesteProblem3();
        teste.testBerechneSummeCorect();
        teste.testBerechneSummeNeasteptat();
        teste.testBerechneDifferenzCorect();
        teste.testBerechneDifferenzNeasteptat();
        teste.testBerechneMultiplikationCorect();
        teste.testBerechneMultiplikationNeasteptat();
        teste.testBerechneDivisionCorect();
        teste.testBerechneDivisionNeasteptat();
    }
}
