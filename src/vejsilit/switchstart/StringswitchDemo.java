package vejsilit.switchstart;

import javax.swing.*;
import java.util.Locale;

public class StringswitchDemo {
    public static void main(String[] args) {
        String imeDana = JOptionPane.showInputDialog("Unesi ime dana u sedmici");
        int redniBrojDana;
        String imeDanaNeosjetljivo = imeDana.toLowerCase();
        switch (imeDanaNeosjetljivo){
            case "monday":
                redniBrojDana = 1;
                break;
            case "tuesday":
                redniBrojDana = 2;
                break;
            case "wendesday":
                redniBrojDana = 3;
                break;
            case "thursday":
                redniBrojDana = 4;
                break;
            case "friday":
                redniBrojDana = 5;
                break;
            case "saturday":
                redniBrojDana = 6;
                break;
            case "sunday":
                redniBrojDana = 7;
                break;
            default:
                redniBrojDana = 0;
                break;
        }
        String poruka = redniBrojDana == 0 ?
                "Ne postoji dan u Engleskom jeziku s imenom"
                        +imeDana:"Dan s imenom" + imeDana+" je "+redniBrojDana+" po redu ";
        JOptionPane.showMessageDialog(null, poruka);

    }
}
