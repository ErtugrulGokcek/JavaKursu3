package Gun29._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        // book class i yaziniz. fields: name, publish year, author
        // 3 adet constructor ekleyiniz
        // kitaplarin ozelliklerini tek bir satirda yazan bir method ekleyiniz.
        // 3 adet kitabi farkli constructor la olusturup, mainde yaziniz

        Book kit1 = new Book();

        kit1.name = "Ince Memet";
        kit1.publishYear = 1990;
        kit1.author = "Yasar Kemal";

        Book kit2 = new Book("Nutuk",1927,"Ataturk");
        Book kit3 = new Book("Nutuk",1927);

        kit1.yazdir();
        kit2.yazdir();
        kit3.yazdir();

        System.out.println("kit1 = " + kit1);


    }
}
