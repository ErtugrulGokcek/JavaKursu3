package Homework._05_12;

public class Soru3 {
    public static void main(String[] args) {

        int sayi = (int)(Math.random()*(80-20)+1)+20 ;
        int birler = sayi%10;
        System.out.println("sayi = " + sayi);

        switch (birler) {
            case 1: System.out.println("birler basamagi =" +" bir");break;
            case 2: System.out.println("birler basamagi =" +" iki");break;
            case 3: System.out.println("birler basamagi =" +" uc");break;
            case 4: System.out.println("birler basamagi =" +" dort");break;
            case 5: System.out.println("birler basamagi =" +" bes");break;
            case 6: System.out.println("birler basamagi =" +" alti");break;
            case 7: System.out.println("birler basamagi =" +" yedi");break;
            case 8: System.out.println("birler basamagi =" +" sekiz");break;
            case 9: System.out.println("birler basamagi =" +" dokuz");break;
            default:
                System.out.println("birler basamagi =" +" sifir");break;
        }



    }
}
