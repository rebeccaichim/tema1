import java.util.Arrays;
public class TesteProblem1 {
    public void testNichtAusreichendeNotenCorect() {
        int[] noten = {84, 29, 65, 38, 42};
        int[] rezultatAsteptat = {29, 38};
        int[] rezultatObtinut = Problem1.nichtAusreichendeNoten(noten);

        if (Arrays.equals(rezultatAsteptat, rezultatObtinut)) {
            System.out.println("note insuficiente neasteptat a trecut");
        } else {
            System.err.println("note insuficiente a esuat");
        }    }

    public void testNichtAusreichendeNotenFalsCorect() {
        int[] noten = {45, 55, 60, 75, 92};
        int[] rezultatAsteptat = {};
        int[] rezultatObtinut = Problem1.nichtAusreichendeNoten(noten);

        if (!Arrays.equals(rezultatAsteptat, rezultatObtinut)) {
            System.out.println("note insuficiente neasteptat a trecut");
        } else {
            System.err.println("note insuficiente neasteptat a esuat");
        }
    }

    public void testBerechneDurchschnittCorect() {
        int[] noten = {84, 29, 65, 38, 42};
        double rezultatAsteptat = 51.6;
        double rezultatObtinut = Problem1.berechneDurchschnitt(noten);
        assert Math.abs(rezultatAsteptat - rezultatObtinut) < 0.01;
    }

    public void testBerechneDurchschnittFalsCorect() {
        int[] noten = {};
        double rezultatAsteptat = 0.0;
        double rezultatObtinut = Problem1.berechneDurchschnitt(noten);
        assert Math.abs(rezultatAsteptat - rezultatObtinut) > 0.01;
    }

    public void testAbgerundeteNotenCorect() {
        int[] noten = {84, 29, 65, 38, 42};
        int[] rezultatAsteptat = {85, 30, 65, 40, 42};
        int[] rezultatObtinut = Problem1.abgerundeteNoten(noten);
        if (Arrays.equals(rezultatAsteptat, rezultatObtinut)) {
            System.out.println("note rotunjite neasteptat a trecut");
        } else {
            System.err.println("note rotunjite neasteptat a esuat");
        }
    }

    public void testAbgerundeteNotenFalsCorect() {
        int[] noten = {45, 55, 60, 75, 92};
        int[] rezultatAsteptat = {45, 55, 60, 75, 92};
        int[] rezultatObtinut = Problem1.abgerundeteNoten(noten);
        if (!Arrays.equals(rezultatAsteptat, rezultatObtinut)) {
            System.out.println("note rotunjite neasteptat a trecut");
        } else {
            System.err.println("note rotunjite neasteptat a esuat");
        }
    }

    public void testMaxAbgerundeteNoteCorect() {
        int[] noten = {84, 29, 65, 38, 42};
        int rezultatAsteptat = 85;
        int rezultatObtinut = Problem1.maxAbgerundeteNote(noten);
        assert rezultatAsteptat == rezultatObtinut;
    }

    public void testMaxAbgerundeteNoteFalsCorect() {
        int[] noten = {45, 55, 60, 75, 92};
        int rezultatAsteptat = 92;
        int rezultatObtinut = Problem1.maxAbgerundeteNote(noten);
        assert rezultatAsteptat != rezultatObtinut;
    }

    public static void main(String[] args) {

        TesteProblem1 teste = new TesteProblem1();
        teste.testNichtAusreichendeNotenCorect();
        teste.testNichtAusreichendeNotenFalsCorect();
        teste.testBerechneDurchschnittCorect();
        teste.testBerechneDurchschnittFalsCorect();
        teste.testAbgerundeteNotenCorect();
        teste.testAbgerundeteNotenFalsCorect();
        teste.testMaxAbgerundeteNoteCorect();
        teste.testMaxAbgerundeteNoteFalsCorect();
    }
}