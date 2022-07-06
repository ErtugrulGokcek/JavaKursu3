package Gun06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // girilen bir stringin sadece sonharfini yazdırınız

        Scanner okuyucu=new Scanner(System.in);

        System.out.print("Kelimeyi Giriniz=");

        String kelime = okuyucu.nextLine();

        System.out.println("kelime = " + kelime);

        int uzunluk = kelime.length();

        char sonharf= kelime.charAt(uzunluk-1);

        System.out.println("sonharf = " + sonharf);




    }
}
