package Gun05;

import java.util.Scanner;

public class _11_Ornek9 {
    public static void main(String[] args) {
        // kullanicidan cadde, sokak, postakodu (int) ve ulke seklinde adres bilgisi alıp yazdır

        Scanner oku=new Scanner(System.in);

        System.out.print("Cadde="); String cadde=oku.nextLine();

        System.out.print("Sokak="); String sokak=oku.nextLine();

        Scanner oku2=new Scanner(System.in);
        System.out.print("Posta Kodu="); int pk=oku2.nextInt(); // int ve string beraber oldugu zaman sikinti yaratiyor, ayri oku yazmak gerekiyor

        System.out.print("Ulke="); String ulke=oku.nextLine();

        System.out.println("cadde = " + cadde);
        System.out.println("sokak = " + sokak);
        System.out.println("pk = " + pk);
        System.out.println("ulke = " + ulke);


    }
}
