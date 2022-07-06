package Gun08;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // girilen bir cumledeki ilk kelimeyi yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Cumleyi Giriniz = ");
        String cumle = oku.nextLine();

        int sonHarf = cumle.indexOf(" ");

        System.out.println("ilk Kelime = " + cumle.substring(0,sonHarf).trim());


    }
}
