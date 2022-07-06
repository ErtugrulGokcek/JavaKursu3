package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {

        tekMiCiftMi(3);
        tekMiCiftMi(4);
        tekMiCiftMi(55);
        tekMiCiftMi(66);

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz = ");
        int sayi = oku.nextInt();
        tekMiCiftMi(sayi);

    }

    public static void tekMiCiftMi(int sayi ){
        if (sayi%2==0)
            System.out.println("cift");
        else
            System.out.println("tek");
    }
}
