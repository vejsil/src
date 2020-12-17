package vejsilit;

import javax.swing.*;

public class PrimjerMjeseciuGodini {
    public static void main(String[] args) {
        String redniBrojMjesecaText = JOptionPane.showInputDialog("Unesi broj mjeseca");
        int redniBrojMjesec = Integer.parseInt(redniBrojMjesecaText);
        String brojGodineText = JOptionPane.showInputDialog("Unesi broj godine:");
        int brojGodine = Integer.parseInt(brojGodineText);
        int BrojDanaUMjesecu = 0;
        switch (redniBrojMjesec){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            BrojDanaUMjesecu = 31;
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                BrojDanaUMjesecu = 30;
                break;
            case 2:
                boolean condition1 = brojGodine %4 == 0 && brojGodine % 100 !=0;
                boolean condition2 = brojGodine %400 == 0;
                boolean prestupna = condition1 || condition2;
                if(prestupna){
                    BrojDanaUMjesecu = 29;

                }else BrojDanaUMjesecu = 28;

                    break;
            default:
                JOptionPane.showMessageDialog(null, "Goidna ima 12 Mjeseci");

                break;

        }
     String mesage = "Za uneseni mjesec'"
             +redniBrojMjesec+"'i godinu'"
             +brojGodine+"'broj dana u mjesecu je'"+
             BrojDanaUMjesecu+"'";
JOptionPane.showMessageDialog(null, mesage);

    }
}
