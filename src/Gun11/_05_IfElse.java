package Gun11;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // girilen bir stringin uzunlugu 10 dan buyukse ve string icinde "study" kelimesi geciyorsa evet gecmiyorsa hayir yazdirin

        Scanner oku = new Scanner(System.in);
        System.out.print("string girin =");
        String text = oku.nextLine();

        if (text.length() >= 10 && text.contains("study")) {
            System.out.println("evet");
        }
        else {
            System.out.println("hayir");
        }

    }
}
