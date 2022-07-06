package Gun13;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        //girilen bir sayinin onlar basamaginin degerini yazi ile yazdiriniz
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz = ");
        int sayi = oku.nextInt();
        int onb = (sayi/10%10);

        switch (onb) {
            case 1: System.out.println("onlar basamagi =" +"bir");break;
            case 2: System.out.println("onlar basamagi =" +"iki");break;
            case 3: System.out.println("onlar basamagi =" +"uc");break;
            case 4: System.out.println("onlar basamagi =" +"dort");break;
            case 5: System.out.println("onlar basamagi =" +"bes");break;
            case 6: System.out.println("onlar basamagi =" +"alti");break;
            case 7: System.out.println("onlar basamagi =" +"yedi");break;
            case 8: System.out.println("onlar basamagi =" +"sekiz");break;
            case 9: System.out.println("onlar basamagi =" +"dokuz");break;
            default:
                System.out.println("onlar basamagi =" +"sifir");

        }





    }
}
