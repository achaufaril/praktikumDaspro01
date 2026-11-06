package pertemuan10;

import java.util.Scanner;

public class Tugas101 {
    public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = aufaril.nextInt();

        if (n < 1) {
            System.out.println("Nilai n minimal harus 1.");
        } else {
            int totalAngka = 0; 

            for (int i = 1; i <= n; i++) {
                
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                    totalAngka++; 
                }
                System.out.println(); 
            }

            System.out.println("Total angka tercetak: " + totalAngka);
        }

        aufaril.close();
    }
}

