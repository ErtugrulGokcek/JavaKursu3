package Gun28._03_Soru;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersEkle (Lesson ders){
        // gelen dersin kredisi arti var olan krediyi toplayip maxCredit check
        int toplamAlinanKredi =0;
        for (Lesson l : dersleri)
            toplamAlinanKredi+=l.credit;

        System.out.println("toplamAlinanKredi = " + toplamAlinanKredi);

        if (toplamAlinanKredi+ ders.credit<= maxCredit) {
            dersleri.add(ders);
            System.out.println("eklendi = " + ders.name);
        }
        else
            System.out.println("Alinabilecek kredi miktari asildi \n" + ders.name);


    }

}
