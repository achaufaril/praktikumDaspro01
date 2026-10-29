package pertemuan9;

import java.util.Scanner;

//Tarif parkir mobil = 2500 + (1 mod 6) * 250 = 2750 Perjam 
//Tarif parkir motor = 1500 + (1 mod 6) * 250 = 1750 Perjam
public class Parkirkendaraan01 {
     public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);
        int jenis = 1, durasi, total = 0;

        while (jenis != 0) {
            System.out.println("--------------------------------------------");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar dari program");
            System.out.println("---------------------------------------------");
            System.out.print("Masukkan jenis kendaraan (1, 2 atau 0): ");
            jenis = aufaril.nextInt();

            if (jenis == 0) {
                System.out.println("Program berakhir.");
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan lama parkir (dalam satuan jam): ");
                durasi = aufaril.nextInt();
                if (durasi < 0) {
                    System.out.println("Durasi tidak valid.");
                    continue;
                }
                if (jenis == 1) {
                    total += durasi * 2750;
                } else {
                    total += durasi * 1750;
                }
                System.out.println("Total parkir: " + total);
            } else {
                System.out.println("Jenis kendaraan tidak valid! pilih 1,2 atau 0 untuk mengakhiri program.");
            }
        }
        System.out.println("---------------------------");
        System.out.println(" PARKIR HARI INI ");
        System.out.println("Total Pembayaran Parkir: Rp " + total);
    }
}

