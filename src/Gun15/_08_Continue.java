package Gun15;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        // girilen bir stringin harflerini teker teker alt alta olacak sekilde yazdirin bosluklari yazmasin

        Scanner oku = new Scanner(System.in);
        System.out.print("bir text girin = ");
        String text = oku.nextLine();

        for(int i=0;i<text.length();i++) {


            if (text.charAt(i) == ' ' )
                continue;
            System.out.println(text.charAt(i));
        }



    }
}
