package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // girilen bir ad soyadin E.G. seklinde yazdiriniz

        Scanner okuyucu=new Scanner(System.in);

        System.out.print("Isminizi Giriniz=");

        String initials= okuyucu.nextLine();

        char Ilk=initials.charAt(0);
        int Bosluk=initials.indexOf(" ");
        char Iki=initials.charAt(Bosluk+1);

        System.out.println("initials = " + Ilk+"."+Iki+".");




    }
}
