package org.example.chap01.topic44;

// Summary: コレクションフレームワーク
// Keyword: Map<K,V> Mapの全要素を取得 Set<E> keyset = map.keyset()  Mapの全valueを取得 Collection<E> values = map.values()  Mapの全キー/値を取得  Set<Map.Entry<K,V>> entry = map.entrySet()
// Level: C

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----HashMap-----");
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"zero"); map.put(10,"ZERO");
        map.put(20,"Twenty");
        System.out.println(map); // {0=zero, 20=Twenty, 10=ZERO}
        System.out.println("map.put(10, \"Ten\")：" + map.put(10, "Ten")); // valueの値が書き換わって　変更前の値が返却される
        System.out.println(map); // {0=zero, 20=Twenty, 10=Ten}
        System.out.println("remove(20)：" + map.remove(20));
        System.out.println("remove(20)：" + map.remove(30)); // 例外は出力されずにnullが返却される
        System.out.println("containKey(20)：" + map.containsKey(20)); // keyが含まれる場合はtrue
        System.out.println("containValue(10)：" + map.containsKey(10)); // valueが含まれる場合はtrue
        Set<Integer> keyset = map.keySet();
        Collection<String> values = map.values();
        Set<Map.Entry<Integer,String >> entryset = map.entrySet();


        System.out.println("ketset()：" + keyset);
        System.out.println("values()：" + values);
        System.out.println("Map.Entry：" + entryset);

        for (Map.Entry<Integer,String> e : entryset ) {
            System.out.println(e.getKey() + "：" + e.getValue());
        }


        System.out.println("LinkedHashMap");
        Map<Integer,String> map1 = new LinkedHashMap<>();
        map1.put(2,"Two");
        map1.put(0,"Zero");
        map1.put(3,"Three");
        map1.put(1,"One");
        System.out.println("LinkedHashMap：" + map1);

        System.out.println("TreeMap"); // ソートされている
        Map<Integer , String > map2 = new TreeMap<>();
        map2.put(2,"Two");
        map2.put(0,"Zero");
        map2.put(3,"Three");
        map2.put(1,"One");
        System.out.println("LinkedHashMap：" + map2);

    }
}
