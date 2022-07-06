package Gun24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class _03_HashSet {
    public static void main(String[] args) {

        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red"); // bu eklenmez
        renkler.add("RED"); // bu eklenir

        // ekrana yazdirma 1. yontem
        System.out.println("renkler = " + renkler);

        // ekrana tek tek yazdirma 2. yontem
        for (String s : renkler ){ // renklerin icindeki elemanlari herhangi bir sirayla s ismini vererek gonderiyor
            System.out.println("s = " + s);




                }
        TreeSet<String> ts = new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");

        System.out.println("ts = " + ts);
        for (String s1: ts) {
            System.out.println("s1 = " + s1);

            Iterator gosterge = ts.iterator(); // indexi n yaptigini yapiyor
            while (gosterge.hasNext()){
                System.out.println("gosterge.next() = " + gosterge.next());
            }

        }

    }
}
