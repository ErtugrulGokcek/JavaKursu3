package Gun08;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // girilen bir kelimenin ilk ve son harfini bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("Kelime Giriniz=");
        String kelime = oku.nextLine();

        int sonHarf = kelime.length();

        System.out.println("sonHarf = " + sonHarf);

        System.out.println("ilk ve son harf = " + kelime.charAt(0) + " " + kelime.charAt(sonHarf-1));



    }
}
