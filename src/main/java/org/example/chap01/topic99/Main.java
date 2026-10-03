package org.example.chap01.topic99;

// Summary: 練習問題用
// Keyword:  Array = 固定長の配列そのもの  Collection = 複数要素を扱うためのコレクションフレームワーク  Arrays = Arrayを操作する便利クラス  Collections = Collection系を操作する便利クラス
// Level: TODO

import java.util.*;

public class Main {

    public static void main(String[] args) {

        var list = new ArrayList<>(List.of(10,20,40,11,22));
        // 自然順序付けかコンパレータで昇順になっていること

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        int[] arry = {20,30,10};
        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));

        var list1 = Arrays.asList("10","20","30");
        list1.set(1,"S");
        System.out.println(list1);

        var list2 = Arrays.asList(20,30,40);
//        list2.add(50);
        list2.set(0,10);
        System.out.println(list2);



        var original = new ArrayList<String>();
        original.add("A");
        original.add("B");

        var copy = List.copyOf(original);
        original.add("C");

        System.out.println(original);
        System.out.println(copy);

        String[] arr = {"A","B","C"};
        List<String> list3 = Arrays.asList(arr);
        list3.add("V");
        System.out.println(list3);




    }
}
