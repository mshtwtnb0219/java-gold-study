package org.example.chap01.topic63;

// Summary: コレクション用の便利なメソッド
// Keyword: 変更不可のコレクション　of() nullも許容されない
// Level: C

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(0,1,2,3);
        Set<String> set = Set.of("Zero","One","Two");
        Map<Integer,String> map = Map.of(1,"First",2,"Second");
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
//        list.add(1);  変更不可のため追加できない
//        Set<Object> set1 = Set.of(null); nullは追加できない
//        Set<Object> set2 = Set.of("A", "A");　重複した値は追加できない
//        Map<Integer,String> map1 = Map.of(0,"A",0,"B"); 重複した値は追加できない


        List<String> list2 = new ArrayList<>(Arrays.asList("x","y"));
        list2.add("z");

        Set<Integer> set2 = new HashSet<>(Set.of(1,2,3,4,5));
        set2.add(9);
        System.out.println(set2);

        Map<Integer,String> map2 = new HashMap<>(Map.of(1,"Fist"));
        map2.put(2,"Second");
        System.out.println(map2);



    }
}
