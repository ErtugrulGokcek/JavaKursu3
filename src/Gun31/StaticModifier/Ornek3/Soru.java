package Gun31.StaticModifier.Ornek3;

public class Soru {
    int a;
    static int b=0;

    void artir(){
        a++;
        b++;
    }

    public static void main(String[] args) {
        Soru s1 = new Soru();
        s1.a=5;

        Soru s2=new Soru();
        s2.a=7;

        // a nin degeri kac oldu? burada verilecek cevap hangi a yi soruyorsun olacak

        System.out.println("s1 = " + s1.a); //5
        System.out.println("s2 = " + s2.a); //7

        Soru.b=6;
        Soru.b=9;

        // b nin degeri kactir? tek bir degeri vardir o da en son deger
        System.out.println("Soru.b = " + Soru.b); //9




    }
}
