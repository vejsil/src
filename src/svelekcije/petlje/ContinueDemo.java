package svelekcije.petlje;

import javax.swing.*;

public class ContinueDemo {
    public static void main(String[] args) {
        String text = " Mnogo manga nije malo ali je mnogo";
        char [] nizKaraktera = text.toCharArray();
        int brojac = 0;
        for (int i = 0; i<nizKaraktera.length; i++ ){
            char karakter = nizKaraktera[i];
            if(karakter != 'm'){
                continue;
            }
            brojac++;
        }
        String poruka = String.format("Broj ponavljanja slova m je '%d'",brojac);
        JOptionPane.showMessageDialog(null, poruka);
    }
}
