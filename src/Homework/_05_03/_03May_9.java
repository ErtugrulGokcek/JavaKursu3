package Homework._05_03;

import java.util.Scanner;

public class _03May_9 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("tamAdSoyadGiriniz=");

        String kelime = oku.nextLine();

        String firstIndex = String.valueOf(kelime.indexOf(" "));

        String lastIndex = String.valueOf(kelime.lastIndexOf(" "));

        Boolean tamAdSoyad2KelimeMi = firstIndex.equals(lastIndex);

        System.out.println("tamAdSoyad2KelimeMi = " + tamAdSoyad2KelimeMi);



    }
}
