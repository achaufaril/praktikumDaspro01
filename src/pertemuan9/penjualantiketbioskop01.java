package pertemuan9;
//harga tiket = 40000 + (1 mod 6) * 2000 = 42000
//Syarat diskon pertama = 3 + (1 mod 3) = 4
//Diskon ke 1 = (8 + (1 mod 5))% = 9%
//Syarat diskon kedua = 8 + (1 mod 4) = 9
//Diskon ke 2 = (15 (1 mod 4))% = 16%
import java.util.Scanner;

public class penjualantiketbioskop01 {
    public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);
        int    hargaTiket = 42000; 
        int    Diskon1 = 4;
        double diskon1 = 0.09; 
        int    Diskon2 = 9;
        double diskon2 = 0.16;
        int    totalTiketTerjual = 0;
        double totalPendapatan = 0;
        int    jumlahTiket;

         System.out.println("=== Program Penjualan Tiket Bioskop ===");
        
        while (true) {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk selesai transaksi hari ini): ");
            jumlahTiket = aufaril.nextInt();

             if (jumlahTiket == 0) {
                break;
            }
            
             if (jumlahTiket < 0) {
                System.out.println("Input jumlah tiket tidak valid (negatif). Silakan masukkan ulang.");
                continue;
            }

             double totalHarga = jumlahTiket * hargaTiket;
             double potonganDiskon = 0; 

             if (jumlahTiket > Diskon2) {
                potonganDiskon = totalHarga * diskon2;
                System.out.println("Pelanggan mendapat diskon " + (diskon2 * 100) + "%");
            } else if (jumlahTiket > Diskon1) {
                potonganDiskon = totalHarga * diskon1;
                System.out.println("Pelanggan mendapat diskon " + (diskon1 * 100) + "%");
            }

            double hargaBayar = totalHarga - potonganDiskon;
            System.out.println("Harga yang harus dibayar pelanggan: Rp " + hargaBayar);
            System.out.println("---------------------------------------------------");

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += hargaBayar;

            System.out.println("\n=== Rekapitulasi Penjualan Hari Ini ===");
            System.out.println("Total tiket terjual : " + totalTiketTerjual);
            System.out.println("Total pendapatan    : Rp " + totalPendapatan);
        }
         aufaril.close();
    }
}
