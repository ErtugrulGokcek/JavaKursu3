package Gun05;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {
        // kisinin agirligini double boyunu int olarak aliniz ve bir satırda boyunuz... ve kilonuz... seklinde yazdırınız.
        // vucut kitle indexini de yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("Agirlik giriniz=");

        double Kilo= oku.nextDouble();

        System.out.print("Boy giriniz=");

        int Boy= oku.nextInt();

        System.out.println("Boy = " + Boy);
        System.out.println("Kilo = " + Kilo);
        System.out.println("Index = " + (Kilo/(Boy*Boy)));
    }
}
