package pertemuan10;

import java.util.Scanner;

public class Star01 {
    public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n =  ");
        int n = aufaril.nextInt();

        for (int i = 1; i <= n; i ++) {
            System.out.print("*");
        }
        
        System.out.println();
        aufaril.close();
    }
}

