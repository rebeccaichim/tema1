import java.util.Arrays;
public class TesteProblem4 {
    public void testFindeBilligsteTastaturCorect() {
        int[] tastaturen = {40, 35, 70, 15, 45};
        int rezultatAsteptat = 15;
        int rezultatObtinut = Problem4.findeBilligsteTastatur(tastaturen);
        assert rezultatAsteptat == rezultatObtinut;
    }
    public void testFindeBilligsteTastaturFalsCorect() {
        int[] tastaturen = {31, 231, 32};
        int rezultatAsteptat = 231;
        int rezultatObtinut = Problem4.findeBilligsteTastatur(tastaturen);
        assert rezultatAsteptat == rezultatObtinut;
    }
    public void testFindeTeuerstenGegenstandCorect() {
        int[] tastaturen = {15, 20, 10, 35};
        int[] usbLaufwerke = {20, 15, 40, 15};
        int rezultatAsteptat = 40;
        int rezultatObtinut = Problem4.findeTeuerstenGegenstand(tastaturen, usbLaufwerke);
        assert rezultatAsteptat == rezultatObtinut;
    }
    public void testFindeTeuerstenGegenstandFalsCorect() {
        int[] tastaturen = {12, 32, 15};
        int[] usbLaufwerke = {70, 53, 33};
        int rezultatAsteptat = 53;
        int rezultatObtinut = Problem4.findeTeuerstenGegenstand(tastaturen, usbLaufwerke);
        assert rezultatAsteptat == rezultatObtinut;
    }
    public void testFindeTeuerstesUsbLaufwerkCorect() {
        int[] usbLaufwerke = {15, 45, 20};
        int budget = 30;
        int rezultatAsteptat = 20;
        int rezultatObtinut = Problem4.findeTeuerstesUsbLaufwerk(usbLaufwerke, budget);
        assert rezultatAsteptat == rezultatObtinut;
    }
    public void testFindeTeuerstesUsbLaufwerkFalsCorect() {
        int[] usbLaufwerke = {25, 35};
        int budget = 26;
        int rezultatAsteptat = 35;
        int rezultatObtinut = Problem4.findeTeuerstesUsbLaufwerk(usbLaufwerke, budget);
        assert rezultatAsteptat == rezultatObtinut;
    }

    public void testBerechneAusgabenCorect() {
        int[] tastaturen = {40, 50, 60};
        int[] usbLaufwerke = {8, 12};
        int budget = 60;
        int rezultatAsteptat = 58;
        int rezultatObtinut = Problem4.berechneAusgaben(budget, tastaturen, usbLaufwerke);
        assert rezultatAsteptat == rezultatObtinut;
    }
    public void testBerechneAusgabenFalsCorect() {
        int[] tastaturen = {40, 70};
        int[] usbLaufwerke = {50};
        int budget = 60;
        int rezultatAsteptat = 50;
        int rezultatObtinut = Problem4.berechneAusgaben(budget, tastaturen, usbLaufwerke);
        assert rezultatAsteptat == rezultatObtinut;
    }

    public static void main(String[] args) {

        TesteProblem4 teste = new TesteProblem4();
        teste.testFindeBilligsteTastaturCorect();
        teste.testFindeBilligsteTastaturFalsCorect();
        teste.testFindeTeuerstenGegenstandCorect();
        teste.testFindeTeuerstenGegenstandFalsCorect();
        teste.testFindeTeuerstesUsbLaufwerkCorect();
        teste.testFindeTeuerstesUsbLaufwerkFalsCorect();
        teste.testBerechneAusgabenCorect();
        teste.testBerechneAusgabenFalsCorect();
    }
}