package Gun32._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // bir pizza siparis hatti yapilmak isteniyor
    // kullaniciya pizza icin 1-Small 2-Medium 3-Large 4-Goster
    // seceneklerini bir menu seklinde vererek verdigi pizzalari bir arraylist e atiniz
    // goster 4 u sectiginde her pizzadan kacar tane siparis verdigini bir methodda yaziniz
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        ArrayList<Pizza> siparis = new ArrayList<>();

        int secim=0;
        do{
            menu();
            secim = oku.nextInt();

            switch (secim){
                case 1: Pizza ps = new Pizza(PizzaSize.SMALL);
                siparis.add(ps);break;
                case 2:Pizza pm = new Pizza(PizzaSize.MEDIUM);
                siparis.add(pm);break;
                case 3:Pizza pl = new Pizza(PizzaSize.LARGE);
                siparis.add(pl);break;
                case 4:siparisYaz(siparis);break;

            }
        }while(secim<=4);
    }
    public static void menu (){
        System.out.println("******MENU******");
        System.out.println("1-Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-Isleme al");
        System.out.println("5-Cikis");
        System.out.print("Secim=");
    }
    public static void siparisYaz(ArrayList<Pizza> siparis){

        int smallcnt=0;
        int mediumcnt=0;
        int largecnt=0;

        for(Pizza p : siparis){
            if (p.size == PizzaSize.SMALL) smallcnt++;
            if (p.size == PizzaSize.MEDIUM) mediumcnt++;
            if (p.size == PizzaSize.LARGE) largecnt++;
        }
        System.out.println("largecnt = " + largecnt);
        System.out.println("mediumcnt = " + mediumcnt);
        System.out.println("smallcnt = " + smallcnt);
        System.out.println("Siparirisiniz alinmistir");
    }
// TODO: her pizza tipi icin ucret belirleyerek toplam ucreti yazdiriniz.
}
