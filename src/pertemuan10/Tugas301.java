package pertemuan10;

import java.util.Scanner;

public class Tugas301 {
     public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = aufaril.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSeluruh = 0;
            int barangTerbanyak = -1;   // -1 agar toko pertama pasti tercatat
            int tokoTerbanyak = 0;
            String ringkasan = "";      // menampung baris ringkasan tiap toko

            for (int toko = 1; toko <= jumlahToko; toko++) {
                System.out.println("Toko " + toko);

                int jumlahPelanggan;
                do {
                    System.out.print("  Jumlah pelanggan: ");
                    jumlahPelanggan = aufaril.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Jumlah pelanggan tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;

                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("    Jumlah barang pelanggan " + p + ": ");
                        barang = aufaril.nextInt();
                        if (barang < 0) {
                            System.out.println("    Jumlah barang tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);

                    totalBarangToko += barang;
                }

                ringkasan += "Toko " + toko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko + "\n";

                totalSeluruh += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }

            System.out.println();
            System.out.print(ringkasan);
            System.out.println("Total barang seluruh toko: " + totalSeluruh);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }

        aufaril.close();
    }
}
    

