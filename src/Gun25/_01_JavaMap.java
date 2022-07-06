package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _01_JavaMap {
    public static void main(String[] args) {
        //Sets -> HashSet, LinkedHashSet, TreeSet
        //Maps -> HashMep, LinkedHashMap, TreeMap

        HashMap<Integer, Integer> m =new HashMap<>();
        Map<Integer, Integer> n =new HashMap<>(); // Map ailesinden hashmap
                                                  // Key i ve value su integer olan bir map
        m.put(2,11); // 2 key ine 11 atandi
        m.put(3,12);
        m.put(6,15);
        m.put(2,5); // 2 anahtarindaki degeri guncelledi

        System.out.println("m = " + m);
        System.out.println("m = " + m.get(2)); // 2 anahtarindaki deger
        System.out.println("m.keySet() = " + m.keySet());
        System.out.println("m.values() = " + m.values());

        for (Integer k : m.keySet()) {
            System.out.println("k = " + k);
        }
        for (Integer v : m.values()){
            System.out.println("v = " + v);
        }
        for ( Map.Entry<Integer,Integer> anahtarValue: m.entrySet()){
            System.out.println("anahtarValue.getKey() = " + anahtarValue.getKey());
            System.out.println("anahtarValue.getValue() = " + anahtarValue.getValue());

        }
        System.out.println("m = " + m.containsKey(2));
        System.out.println("m = " + m.containsValue(5));

        m.remove(2); // 2 anahtarindaki her sey siliniyor
        System.out.println("m = " + m);

        System.out.println("m = " + m.keySet().size());
        m.clear();
        System.out.println("m = " + m);
    }
}
