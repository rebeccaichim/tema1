import java.util.Arrays;
public class Problem4 {

    // Cea mai ieftina tastatura
    public static int findeBilligsteTastatur(int[] tastaturen) {
        if (tastaturen.length == 0) {
            return -1;
        }

        int billigste = tastaturen[0];
        for (int preis : tastaturen) {
            if (preis < billigste) {
                billigste = preis;
            }
        }
        return billigste;
    }

    // Cel mai scump obiect
    public static int findeTeuerstenGegenstand(int[] tastaturen, int[] usbLaufwerke) {
        int teuersterTastatur = 0;
        if (tastaturen.length > 0) {
            teuersterTastatur = tastaturen[0];
            for (int tastatur : tastaturen) {
                if (tastatur > teuersterTastatur) {
                    teuersterTastatur = tastatur;
                }
            }
        }
        int teuerstesUsbLaufwerk = 0;
        if (usbLaufwerke.length > 0) {
            teuerstesUsbLaufwerk = usbLaufwerke[0];
            for (int usbLaufwerk : usbLaufwerke) {
                if (usbLaufwerk > teuerstesUsbLaufwerk) {
                    teuerstesUsbLaufwerk = usbLaufwerk;
                }
            }
        }
        return Math.max(teuersterTastatur, teuerstesUsbLaufwerk);
    }

    // Cea mai scumpa unitate pe care si-o permite Markus
    public static int findeTeuerstesUsbLaufwerk(int[] usbLaufwerke, int budget) {
        int teuerstesUsb = -1;
        for (int preis : usbLaufwerke) {
            if (preis <= budget && preis > teuerstesUsb) {
                teuerstesUsb = preis;
            }
        }
        return teuerstesUsb;
    }

    // Cea mai ieftina tastatura + cea mai scumpa unitate care intra in buget
    public static int berechneAusgaben(int budget, int[] tastaturen, int[] usbLaufwerke) {
        int billigsteTastatur = findeBilligsteTastatur(tastaturen);
        int teuerstesUsb = findeTeuerstesUsbLaufwerk(usbLaufwerke, budget - billigsteTastatur);

        if (billigsteTastatur == -1 || teuerstesUsb == -1) {
            return -1;
        }

        return billigsteTastatur + teuerstesUsb;
    }
}