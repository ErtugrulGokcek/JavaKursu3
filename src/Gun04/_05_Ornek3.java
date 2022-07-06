package Gun04;

public class _05_Ornek3 {
    public static void main(String[] args) {
        // kisinin agirligini double boyunu int olarak degerler veriniz ve bir satırda boyunuz... ve kilonuz... seklinde yazdırınız.
        // vucut kitle indexini de yazdırınız
        double agirlik=76.8;
        int boy=178;

        double KitleIndexi1=agirlik/(boy*boy);
        int KitleIndexi2= (int)agirlik/(boy*boy);

        System.out.println("agirliginiz = " + agirlik);
        System.out.println("boyunuz = " + boy);
        System.out.println("KitleIndexi1 = " + KitleIndexi1);
        System.out.println("KitleIndexi2 = " + KitleIndexi2);




    }
}
