package Gun12;

import java.util.Scanner;

public class _04_IfElse {
    public static void main(String[] args) {
        //kullanicinin girecegi sayi cift ise bir stringe cift atayiniz
        // tek ise tek atayiniz ve ekrana stringi yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz =");
        int sayi = oku.nextInt();

        // klasik yontem
        if (sayi%2 == 1)
            System.out.println("tek"); // if ve elseden sonra tek parantez varsa şekilli parantez koymaya gerek yok
        else
            System.out.println("cift");

        // tek satirda yazma yontemi : Ternary

        String sonuc = (sayi%2 == 1) ? "tek" : "cift";
        // sart dogru ise ilk bolum degilse ikinci bolum calisir

        System.out.println(((sayi%2 == 1) ? "tek" : "cift"));

    }
}
