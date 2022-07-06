package Gun10;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // girilen 3 sayidan en buyuk olanini bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi1 =");
        int sayi1 = oku.nextInt();
        System.out.print("Sayi2 =");
        int sayi2 = oku.nextInt();
        System.out.print("Sayi3 =");
        int sayi3 = oku.nextInt();

        if (sayi1>sayi2)
            if (sayi1>sayi3) {
                System.out.println(sayi1);
        }
        if (sayi2>sayi1)
            if (sayi2>sayi3) {
                System.out.println(sayi2);
            }
        if (sayi3>sayi2)
            if (sayi3>sayi1) {
                System.out.println(sayi3);
            }
    }
}
