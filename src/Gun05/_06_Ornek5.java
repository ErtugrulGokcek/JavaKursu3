package Gun05;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {
        // Bir karenin kenarini kullanicidan isteyip Cevresini ve Alanini bulunuz

        Scanner oku=new Scanner(System.in);

        System.out.print("Karenin kenarini giriniz=");

        int kenar= oku.nextInt();

        int Alan= kenar*kenar;
        int Cevre=kenar*4;

        System.out.println("Cevre = " + Cevre);
        System.out.println("Alan = " + Alan);

        System.out.println("Cevre = " + (kenar*4));
        System.out.println("Alan = " + (kenar*kenar));


    }
}
