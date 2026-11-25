//p=1
//bil[0], bil[1], bil[2], bil[3]
//[1,9,-2,21]

package pertemuan12;
import java.util.Arrays;
public class ArrayBilangan1 {
    public static void main(String[] args) {
        int[] bil = new int [4];
         bil[0] = 1;
         bil[1] = 9;
         bil[2] = -2;
         bil[3] = 21;

    for (int i = 0; i < bil.length; i++) {
         System.out.println("bil[" + i + "] = " + bil[i]);
       }
    for (int nilai : bil) {
         System.out.println(nilai);
       }
        System.out.println(Arrays.toString(bil));
    }
    
}
