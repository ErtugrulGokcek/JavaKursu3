package Homework._05_24;

public class Soru2 {
    public static void main(String[] args) {


        System.out.println("ortadaki kelime = " +ortaKelime());

    }
    public static String ortaKelime(){
        String cumle = "bugun hava cok guzel olacak.";
        String [] kelimeler=cumle.split(" ");
        String a = kelimeler[kelimeler.length/2];
        return a;
    }

}
