package Gun08;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Girilen bir kelimenin bos olup olmadigini yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Kelimeyi Giriniz=");
        String kelime = oku.nextLine();

        System.out.println("bos mu? = " + kelime.isEmpty());



    }
}
