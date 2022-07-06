package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // girilen bir cumledeki ilk iki kelimeyi yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Cumleyi Giriniz=");
        String cumle = oku.nextLine();

        String bosluk = cumle.replaceFirst(" ","");

        int bosluk2 = bosluk.indexOf(" ");

        System.out.println("ilk iki kelime = " + cumle.substring(0,bosluk2+1));

        // 2. cozum

        int birinciBosluk = cumle.indexOf(" ");
        int ikinciBosluk = cumle.indexOf(" ",birinciBosluk+1); // birinci bosluktan sonraki boslugu ara



    }
}
