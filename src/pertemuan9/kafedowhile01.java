package pertemuan9;
// hargaKopi = 10000 + (1 mod 5) × 1000 = 11000
// hargaTeh = 5000 + (1 mod 4) × 1000 = 6000
// hargaRoti = 15000 + (1 mod 6) × 1000 = 16000
import java.util.Scanner;

public class kafedowhile01 {
    public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 11000, hargaTeh = 6000, hargaRoti = 16000;
        int totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = aufaril.nextLine();
            
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            
            System.out.print("Jumlah kopi: ");
            kopi = aufaril.nextInt();
            System.out.print("Jumlah teh: ");
            teh = aufaril.nextInt();
            System.out.print("Jumlah roti: ");
            roti = aufaril.nextInt();
            
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            aufaril.nextLine(); 
            
        } while (true);
        
        System.out.println("Semua transaksi selesai.");
    }
}

