package svelekcije;

import javax.swing.*;

public class BreakDemo {
    public static void main(String[] args) {
        int [] brojevi ={ 23, 357, 75, 187, 456, 3, 45 };
        String uneseniBrojText = JOptionPane.showInputDialog("Uneseni broj je tacan, pogodili ste ");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean postojiBroj = false;
        for (int i = 0; i<brojevi.length; i++) {
            int broj = brojevi [i];
            if(broj == uneseniBroj){
                postojiBroj = true;
                break;
            }
        }
        String poruka = postojiBroj ? "Sretan":"Nesretan";
        JOptionPane.showMessageDialog(null, poruka);

        }
    }

