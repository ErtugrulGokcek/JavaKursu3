package Homework._05_24;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        System.out.println(reverseWord());

    }
    public static String reverseWord (){
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cumle giriniz = ");
        String cumle = oku.nextLine();

        String[] cumle2 = cumle.split(" ");
        String [] cumle3 = new String[cumle2.length];
        String cumle4 ="";
        for (int i=cumle2.length-1;i>=0;i--){
            cumle3 [i] = cumle2 [i];
            cumle4 = cumle4.concat(cumle3[i]) +" ";
        }
        return cumle4;
    }
}
