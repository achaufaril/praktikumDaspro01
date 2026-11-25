//p=1
//30 + (P mod 71)= 30 + 1 = 31
package pertemuan12;

import java.util.Scanner;

public class ArrayRataNilai1 {
    public static void main(String[] args) {
     Scanner aufaril = new Scanner(System.in);
     int[] nilaiMhs = new int[10];
     int total = 0;
     int jmlLulus = 0;
     double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = aufaril.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
            }
     }
         rata2 = (double) total / nilaiMhs.length;
         System.out.println("Total nilai: " + total);
         System.out.println("Rata-rata: " + rata2);
         System.out.println("Jumlah mahasiswa lulus: " + jmlLulus);
     
     int tertinggi = nilaiMhs[0];
     int terendah = nilaiMhs[0];
     
     for (int i = 1; i < nilaiMhs.length; i++) {
         if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
         if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
     }
         System.out.println("Nilai tertinggi: " + tertinggi);
         System.out.println("Nilai terendah: " + terendah);
   }
    
}
