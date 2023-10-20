import java.util.Arrays;

public class TesteProblem3 {
    public void testBerechneSummeCorect() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatAsteptat = {1, 4, 1, 7, 5, 7, 0, 0, 0};
        int[] rezultatObtinut = Problem3.berechneSumme(zahl1, zahl2);
        assert Arrays.equals(rezultatAsteptat, rezultatObtinut);
    }

    public void testBerechneSummeNeasteptat() {
        int[] zahl1 = {1, 3, 0, 0};
        int[] zahl2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        try {
            Problem3.berechneSumme(zahl1, zahl2);
            assert false;
        } catch (ArrayIndexOutOfBoundsException e) {
            assert true;
        }
    }
    public void testBerechneDifferenzCorect() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatAsteptat = {7, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatObtinut = Problem3.berechneDifferenz(zahl1, zahl2);
        assert Arrays.equals(rezultatAsteptat, rezultatObtinut);
    }

    public void testBerechneDifferenzNeasteptat() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = {8, 9, 0, 0, 0, 0, 0, 0, 0};
        try {
            Problem3.berechneDifferenz(zahl1, zahl2);
            assert false;
        } catch (AssertionError e) {
            assert true;
        }
    }

    public void testBerechneMultiplikationCorect() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int ziffer = 2;
        int[] rezultatAsteptat = {2, 6, 0, 0, 0, 0, 0, 0, 0};
        int[] rezultatObtinut = Problem3.berechneMultiplikation(zahl1, ziffer);
        assert Arrays.equals(rezultatAsteptat, rezultatObtinut);
    }

    public void testBerechneMultiplikationNeasteptat() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int ziffer = 9;
        try {
            Problem3.berechneMultiplikation(zahl1, ziffer);
            assert false;
        } catch (AssertionError e) {
            assert true;
        }
    }

    public void testBerechneDivisionCorect() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int ziffer = 2;
        int[] rezultatAsteptat = {0, 6, 5, 0, 0, 0, 0, 0, 0};
        int[] rezultatObtinut = Problem3.berechneDivision(zahl1, ziffer);
        assert Arrays.equals(rezultatAsteptat, rezultatObtinut);
    }

    public void testBerechneDivisionNeasteptat() {
        int[] zahl1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int ziffer = 0;
        try {
            Problem3.berechneDivision(zahl1, ziffer);
            assert false;
        } catch (ArithmeticException e) {
            assert true;
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