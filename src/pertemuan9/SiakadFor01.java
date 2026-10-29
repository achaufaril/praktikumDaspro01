package pertemuan9;
// Jumlah mahasiswa 8 + (1 mod 5)= 9 
// Batas kelulusan 55 + (1 mod 11) = 56
import java.util.Scanner;

public class SiakadFor01 {
    public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahMahasiswa = 9;

        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 9; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = aufaril.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 56) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        aufaril.close();
         
    }
}

