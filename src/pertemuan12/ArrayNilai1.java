//p=1
//60 + (1 mod 41)= 60 + 1 = 61
package pertemuan12;

import java.util.Scanner;

public class ArrayNilai1 {
   public static void main(String[] args) {
     int[] nilaiAkhir = new int[10];
     Scanner aufaril = new Scanner(System.in);
     
    for (int i = 0; i < nilaiAkhir.length; i++) {
         System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
         nilaiAkhir[i] = aufaril.nextInt();
    }
    for (int i = 0; i < nilaiAkhir.length; i++) {
         String status = (nilaiAkhir[i] > 61) ? "LULUS" : "TIDAK LULUS";
          System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" +
         status + ")");
    }
  } 
}
