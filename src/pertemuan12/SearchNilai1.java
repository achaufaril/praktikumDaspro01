//p=1
//A=50 + (1 mod 50)=51
//B=20 + (1 mod 60)=21
package pertemuan12;
import java.util.Arrays;
public class SearchNilai1 {
    public static void main(String[] args) {
     int[] nilai = {78, 65, 90, 55, 88, 72};
     int key = 90;
     boolean ditemukan = false;
  
     for (int i = 0; i < nilai.length; i++) {
         if (nilai[i] == key) {
             System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
             ditemukan = true;
             break;
        }
    }
    if (!ditemukan) {
    System.out.println("Nilai yang dicari (" + key + ") tidak ditemukan di dalam data array."); 
    }
     
     int[] nilaiterurut = {78, 65, 90, 55, 88, 72};
     for (int i = 0; i < nilai.length - 1; i++) {
         for (int j = 0; j < nilai.length - 1 - i; j++) {
             if (nilai[j] < nilai[j + 1]) {
                 int temp = nilai[j];
                 nilai[j] = nilai[j + 1];
                 nilai[j + 1] = temp;
            }
        }
    }
          System.out.println(Arrays.toString(nilai));
 }  
}
