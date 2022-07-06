package Gun11;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // girilen bir stringin uzunlugu 10 dan buyukse ve string icinde "study" kelimesi geciyorsa evet gecmiyorsa hayir yazdirin kucuk buyuk harf bagimsiz

        Scanner oku = new Scanner(System.in);
        System.out.print("bir string girin =");
        String text = oku.nextLine();

        String text2 = text.toLowerCase();

        if (text2.length() > 10 && text2.contains("study")) {
            System.out.println("evet");
        }
        else {
            System.out.println("hayir");
        }
    }
}
