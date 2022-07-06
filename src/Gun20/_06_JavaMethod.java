package Gun20;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıya aşağıdaki gibi bir menü çıkartarak sürekli değişkenleri alınız ve
// her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */

        Scanner oku = new Scanner(System.in);

        int secim=0;
    do{
        menuYaz();
        secim= oku.nextInt();
        islemYap(secim);
    }while (secim<6 && secim>0 );

    }
    public static void menuYaz(){
        System.out.print(" "+
                "           1-toplama\n" +
                "            2-çıkarma\n" +
                "            3-çarpma\n" +
                "            4-bolme\n" +
                "            5-Faktöryel\n" +
                "            6-Çıkış\n Seciminiz =");
    }
    public static void  islemYap(int secim){
        Scanner oku = new Scanner(System.in);
        int sayi1=0;
        int sayi2=0;
        if (secim<5) {
            System.out.print("1.sayi = ");
            sayi1 = oku.nextInt();
            System.out.print("2.sayi = ");
            sayi2 = oku.nextInt();
        } else if (secim==5) {
            System.out.print("sayi =");
            sayi1 = oku.nextInt();

        }
        switch (secim){
            case 1:
                System.out.println(sayi1+sayi2);break;
            case 2:
                System.out.println(sayi1-sayi2);break;
            case 3:
                System.out.println(sayi1*sayi2);break;
            case 4:
                System.out.println(sayi1/sayi2);break;
            case 5:
                int carpim=0;
                for (int i=1;i<=sayi1;i++){
                    carpim=carpim*i;
                }
                System.out.println("carpim = " + carpim);break;
            case 6:
                System.out.println("Cikis");break;
            default:
                System.out.println("Hatali secim");break;
        }

    }
}
