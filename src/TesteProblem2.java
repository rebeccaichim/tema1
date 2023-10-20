public class TesteProblem2 {
    public void testFindeMaximaleZahlCorect() {
        int[] zahlen = {4, 8, 3, 10, 17};
        int rezultatAsteptat = 17;
        int rezultatObtinut = Problem2.findeMaximaleZahl(zahlen);
        assert rezultatAsteptat == rezultatObtinut;
    }
    public void testFindeMaximaleZahlFalsCorect() {
        int[] zahlen = {1,5};
        int rezultatAsteptat = 1;
        int rezultatObtinut = Problem2.findeMaximaleZahl(zahlen);
        assert rezultatAsteptat == rezultatObtinut;
    }
    public void testFindeMinimaleZahlCorect() {
        int[] zahlen = {4, 8, 3, 10, 17};
        int rezultatAsteptat = 3;
        int rezultatObtinut = Problem2.findeMinimaleZahl(zahlen);
        assert rezultatAsteptat == rezultatObtinut;
    }
    public void testFindeMinimaleZahlFalsCorect() {
        int[] zahlen = {1,5};
        int rezultatAsteptat = 5;
        int rezultatObtinut = Problem2.findeMinimaleZahl(zahlen);
        assert rezultatAsteptat == rezultatObtinut;
    }
    public void testFindeMaximaleSummeCorect() {
        int[] zahlen = {4, 8, 3, 10, 17};
        int rezultatAsteptat = 32;
        int rezultatObtinut = Problem2.findeMaximaleSumme(zahlen);
        assert rezultatAsteptat == rezultatObtinut;
    }

    public void testFindeMaximaleSummeFalsCorect() {
        int[] zahlen = {1,5};
        int rezultatAsteptat = 0;
        int rezultatObtinut = Problem2.findeMaximaleSumme(zahlen);
        assert rezultatAsteptat == rezultatObtinut;
    }

    public void testFindeMinimaleSummeCorect() {
        int[] zahlen = {4, 8, 3, 10, 17};
        int rezultatAsteptat = 25;
        int rezultatObtinut = Problem2.findeMinimaleSumme(zahlen);
        assert rezultatAsteptat == rezultatObtinut;
    }
    public void testFindeMinimaleSummeFalsCorect() {
        int[] zahlen = {1,5};
        int rezultatAsteptat = 6;
        int rezultatObtinut = Problem2.findeMinimaleSumme(zahlen);
        assert rezultatAsteptat == rezultatObtinut;
    }

    public static void main(String[] args) {

        TesteProblem2 teste = new TesteProblem2();
        teste.testFindeMaximaleZahlCorect();
        teste.testFindeMaximaleZahlFalsCorect();
        teste.testFindeMinimaleZahlCorect();
        teste.testFindeMinimaleZahlFalsCorect();
        teste.testFindeMaximaleSummeCorect();
        teste.testFindeMaximaleSummeFalsCorect();
        teste.testFindeMinimaleSummeCorect();
        teste.testFindeMinimaleSummeFalsCorect();
    }
}

