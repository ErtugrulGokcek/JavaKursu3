package Gun05;

import java.util.Locale;
import java.util.Scanner;

public class _08_DoubleGirisi {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Double deger giriniz=");
        oku.useLocale(Locale.ENGLISH); // giris sirasında nokta/virgul degisikligi

        double deger= oku.nextDouble();

        System.out.println("deger = " + deger);

    }
}
