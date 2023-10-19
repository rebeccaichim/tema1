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
}