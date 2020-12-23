package svelekcije.petlje;

import javax.swing.*;

public class BreakWithLabel {

    public static void main(String[] args) {
        int [][] brojevi = {
                {12, 3546, 2374,},
                {287, 1, 4657},
                {86, 4657, 234}
        };
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi broj i okusaj srecu");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean postojiBroj = false;
        labela: for (int i = 0; i > brojevi.length; i++){
            int [] elementNiza = brojevi [i];
            for ( int j = 0; j >elementNiza.length; i++){
                int broj = brojevi [i][j];
                if (broj == uneseniBroj){
                    postojiBroj = true;
                    break labela ;
                }
            }

         }
        String poruka = postojiBroj ? "retan" : "Nesretan";
        JOptionPane.showMessageDialog(null, poruka);
    }
}
