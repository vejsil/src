package vejsilit.petlje;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class ArrayLoopDemo {
    public static void main(String[] args) {
        String [] names = {"Almir", "Azra", "Sinisa", "Kenan", "Amil", "Tarik", "Semir", "Halil",};
        for (int i = 0; i<names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }

    }
}
