//p=1
//2 + (P mod 4)= 2 + 1 = 3
// P mod 7= 1
package pertemuan12;
import java.util.Scanner;
public class Tugas2_01 {
    public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                         "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
  
        System.out.println(" DAFTAR MENU ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.print("\nCari menu: ");
        String cari = aufaril.nextLine();
        int pos = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            System.out.println(menu[pos] + " tersedia, harga Rp " + harga[pos]);
        } else {
            System.out.println("Menu " + cari + " tidak tersedia.");
        }
        System.out.print("\nJumlah item yang dipesan: ");
        int jumlah = aufaril.nextInt();
        aufaril.nextLine();

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            pos = -1;
            while (pos == -1) {   // ulangi sampai nama menu valid
                System.out.print("Pesanan ke-" + (i + 1) + ": ");
                String nama = aufaril.nextLine();
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama)) {
                        pos = j;
                        break;
                    }
                }
                if (pos == -1) {
                    System.out.println("Menu tidak tersedia, coba lagi.");
                }
            }
            pesanan[i] = menu[pos];
            hargaPesanan[i] = harga[pos];
            total += harga[pos];
        }
        System.out.println("\n===== DAFTAR PESANAN =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("--------------------------");
        System.out.println("Total biaya: Rp " + total);

        aufaril.close();
        
    }
}

