package Gun24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS: HashSet (hizli), LinkedHashSet(ekleme sirasina gore), TreeSet (herzaman sirali)

        // hizli calismak icin kendi ozel algoritma sirasina gore saklar

        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("hs = " + hs); //hs = [bes, dort, iki, bir, uc]

        // eklenme sirasina gore elemanlarini tutuyor

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        System.out.println("lhs = " + lhs); //lhs = [bir, iki, uc, dort, bes]

        // alfabetik olarak sirali tutar

        TreeSet<String> ths = new TreeSet<>();
        ths.add("bir");
        ths.add("iki");
        ths.add("uc");
        ths.add("dort");
        ths.add("bes");
        System.out.println("ths = " + ths); //ths = [bes, bir, dort, iki, uc]

    }
}
