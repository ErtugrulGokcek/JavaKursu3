package Homework._05_03;

public class _03May_10 {
    public static void main(String[] args) {

        String isim = "Ahmet Emin Yilmaz";

        char firstInitial = isim.charAt(0);

        int second = isim.indexOf(" ");

        char secondInitial = isim.charAt(second+1);

        int third = isim.lastIndexOf(" ");

        char thirdInitial = isim.charAt(third+1);

        System.out.println("Initials = " + firstInitial + "." + secondInitial + "." + thirdInitial +".");


    }
}
