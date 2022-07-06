package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        // bir kartvizit uygulamasini 2 kisi icin yapiniz

        Map<String, String> sKartvizit = new HashMap<>();

        sKartvizit.put("isim", "Nazmiye");
        sKartvizit.put("email","nazmiye@gmail.com");
        sKartvizit.put("adres", "Turkiye");
        sKartvizit.put("telefon","3434343434");

        System.out.println("sKartvizit.get(\"isim\") = " + sKartvizit.get("isim"));
        System.out.println("sKartvizit.get(\"telefon\") = " + sKartvizit.get("telefon"));

        Map<String, String> iKartvizit = new HashMap<>();

        iKartvizit.put("isim", "Kadir");
        iKartvizit.put("email","kadir@gmail.com");
        iKartvizit.put("adres", "Almanya");
        iKartvizit.put("telefon","5656565656");

        Map<String, Map<String,String>> kartDefteri = new HashMap<>();
        kartDefteri.put("nazmiye",sKartvizit);
        kartDefteri.put("kadir",iKartvizit);

        kartDefteri.get("kadir").get("telefon");
        System.out.println("Kadirin telefonu = " + kartDefteri.get("kadir").get("telefon"));

        for ( Map.Entry<String,Map<String,String>> kartvizit: kartDefteri.entrySet()){
            System.out.println("kartvizit = " + kartvizit);
        }

    }
}
