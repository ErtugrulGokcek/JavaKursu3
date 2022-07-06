package Gun28._02_Soru;

public class Soru {
    public static void main(String[] args) {
        // Math sinifindaki methodlardan 5 tanesini kendi isimlendirmenizle ayri bir sinifa yazarak
        // kendi methodunuzun icinde Math. fonksiyonlarini kullanabilirsiniz
        // mainden nesne olusturmadan direk kullanilmasini saglatacak ornek kullanimleri yaziniz

        MyMath.getMin(3,4);
        MyMath.getMax(3,4);
        MyMath.getAbs(-5);
        MyMath.getPow(2,3);
        MyMath.getRandom(3,15);

        int []dizi = {2,45,6,77,89};
        MyMath.getDiziElemanlariTopla(dizi);

        System.out.println("MyMath.getMin(3,4) = " + MyMath.getMin(3,4));


    }
}
