package vejsilit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class vjezbanje {
    public static void main(String[] args) {
        char [] nizIzKojegKopiramo =
            {'a', 'e', 'c', 'a'
                    ,'f', 'f', 'e', 't',
                    'i', 'n', 's', 'g'};
        char [] copyTo = Arrays.copyOfRange(nizIzKojegKopiramo, 2,10);
        System.out.println(copyTo);
    }


}