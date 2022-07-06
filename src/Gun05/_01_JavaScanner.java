package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        Scanner okuyucu=new Scanner(System.in);

        // oku ismine bir okuyucu tanimlandi, (System.in) klavyeden giris yapmak uzere

        System.out.print("Sayi Giriniz="); // println yaparsan sayi giririnizin altina yazdiririr sayiyi

        int sayi=okuyucu.nextInt();
        // oku.netInt() ekrandan sayiyiyi aldi ve bizde sayi degiskenine attik

        System.out.println("sayi = " + sayi);




    }
}
