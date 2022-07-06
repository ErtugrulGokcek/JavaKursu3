package Homework._05_24;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        System.out.println(reverseString());

    }
    public static String reverseString() {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cumle giriniz = ");
        String cumle = oku.nextLine();

        String e = "";
        String []d = new String[cumle.length()];
        for (int i = cumle.length()-1; i >= 0; i--) {
           d [i]= String.valueOf(cumle.charAt(i));
            e = e.concat(d[i]);
        }
        return e;
    }
}
