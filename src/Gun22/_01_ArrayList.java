package Gun22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // array: boyut sayisinin belli oldugu durumlardaki veriler icin kullanilir
        int [] dizi= new int[5]; // array 5 elemanli degistirilemiyor

        //ArrayList: boyutu dinamik olarak degisebilen, yani eleman eklendikce artan, sildikce azalan array

        ArrayList<Integer> integerList = new ArrayList<>(); // tanimlama
        ArrayList<Boolean> booleanList = new ArrayList<>();
        ArrayList<String> stringLsit = new ArrayList<>();

        // String ArrayList tanimlayalim
        ArrayList<String> isimler = new ArrayList<>();

        // eleman ekleme
        isimler.add("Ahmet"); // uzunlugu 1 oldu
        isimler.add("Ayse"); // uzunlugu 2 oldu
        isimler.add("Kaya");
        isimler.add("Kaya"); // hep sonuna ekliyor

        System.out.println("isimler = " + isimler); // arrays.to string e gerek yok direk print edilebilir
        System.out.println("isimler.size() = " + isimler.size()); // dizilerdeki length e karsilik geliyor

        isimler.add(1,"Zeynep"); // verilen indexe ekliyor, digerleri 1 kaliyor
        System.out.println("isimler = " + isimler);

        isimler.set(3,"Mehmet"); // belli bir indexteki degeri degistiriyor
        System.out.println("isimler = " + isimler);

        int elemanSayisi= isimler.size();

        // eleman silme

        isimler.remove("Kaya");
        System.out.println("isimler = " + isimler);
        isimler.remove(1);
        System.out.println("isimler = " + isimler);

        int indexOfAyse = isimler.indexOf("Ayse");
        System.out.println("indexOfAyse = " + indexOfAyse);

        for(int i=0;i<isimler.size();i++)
            System.out.println("isimler elemanlari = " + isimler.get(i));

        isimler.clear(); // tum liste bosaltildi ilk haline dondu



    }
}
