package svelekcije;

import javax.swing.*;
import java.util.ArrayList;

public class SwitcgCaseWithoutBreak {
    public static void main(String[] args) {
        String brojDanaText = JOptionPane.showInputDialog("Unesi broj dana u sedmici");
        int brojDana = Integer.parseInt(brojDanaText);
        ArrayList<String> dinamickiNiz = new ArrayList<String>();
        switch (brojDana){
            case 1:
                dinamickiNiz.add("Monday");
            case 2:
                dinamickiNiz.add("Tuesday");
            case 3:
                dinamickiNiz.add("Wendesday");
            case 4:
                dinamickiNiz.add("Thursday");
            case 5:
                dinamickiNiz.add("friday");
            case 6:
                dinamickiNiz.add("sayurday");
            case 7:
                dinamickiNiz.add("sunday");

            default:
                JOptionPane.showMessageDialog(null, "Cestitam");

        }
        dinamickiNiz.forEach(System.out::println);

    }
}
