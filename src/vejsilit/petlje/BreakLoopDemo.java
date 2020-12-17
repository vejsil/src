package vejsilit.petlje;

import javax.swing.*;

public class BreakLoopDemo {
    public static void main(String[] args) {

        int [] brojevi = {23, 34, 47, 376, 398, 365};
        String brojText = JOptionPane.showInputDialog("Unesi broj i okusaj srecu");
        int uneseniBroj = Integer.parseInt(brojText);
        boolean postoji = false;

        for(int broj: brojevi){
            if (uneseniBroj == broj){

            postoji = true;
            break;
          }
        }
        String poruka = postoji? "igre su za tebe":
                "igre na srecu su prevara";
        JOptionPane.showMessageDialog(null,poruka
        );
    }
}
