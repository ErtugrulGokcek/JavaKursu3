package Gun24;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        int sayi = 5; // hafizada bir sayi tutuyor
        int [] dizi = new int[5]; // hafizada 5 rakam tutuyor
        int [][] tablo = new int[3][4]; // hafizada 12 sayi tutuyor

        // dinamik boyutlu diziler lazim
        ArrayList<Integer> liste = new ArrayList<>(); // boyu eklendikce artan dinamik dizi
        ArrayList<ArrayList<Integer>> listelerimListesi = new ArrayList<>(); // dinamik 2 boyutlu

        // elemanlari gelisiguzel miktarinca tutan degil, ayni elemanlari tutmayan
        // yani 1 elemandan sadece 1 tane olan diziler lazım. hangi sirada oldugunun bir onemi yok
        // bunlara SET denir : LINKEDHASHSET(eklenme sirasina gore), TREESET (ordered-sirali), HASHSET (hizli)

        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);

        System.out.println("hs1 = " + hs1);


    }
}
