package Gun13;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // kullanicidan Fizik:90 seklinde not bilgisi aliniz
        // 90 icin A 80 icin B 70 icin C 60 icin D 40 icin E daha azi icin F yazdir

        Scanner oku = new Scanner(System.in);
        System.out.print("Ders ve notunuzu girin = ");
        String dersNot = oku.nextLine();

        String dersAd = dersNot.replaceAll("[0-9]","");
        int not = Integer.parseInt(dersNot.replaceAll("[^0-9]",""));

        if (not >= 90) {
            System.out.println("A");
        } else if (not >=80) {
            System.out.println("B");
        } else if (not >= 70) {
            System.out.println("C");
        } else if (not >= 60) {
            System.out.println("D");
        } else if (not >= 40) {
            System.out.println("E");
        }else {
            System.out.println("F");
        }


    }
}
