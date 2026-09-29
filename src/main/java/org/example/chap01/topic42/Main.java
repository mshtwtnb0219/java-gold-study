package org.example.chap01.topic42;

// Summary: コレクションフレームワーク
// Keyword: Set<E>インターフェース HashSet<E> LinkedHashSet<E> TreeSet<E>
// Level: B

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // HashSet<E>
        System.out.println("----------HashSet<E>----------");
        Set<Integer> set1 = new HashSet<>();
        boolean add1 = set1.add(3); // 要素を追加して重複しているかを真偽値で返却
        boolean add2 = set1.add(3); // 重複している
        set1.add(null); set1.add(null);
        set1.add(2); set1.add(1);
        System.out.println("HashSet" + set1); // HashSet[null, 1, 2, 3]
        System.out.println("add1：" + add1 + "　　add2；" + add2);
        boolean rmv1 = set1.remove(3);
        boolean rmv2 = set1.remove(3);
        System.out.println("rmv1：" + rmv1 + "　　rmv2：" + rmv2);

        // LinkedHashSet<E>
        System.out.println("----------LinkedHashSet<E>----------");
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(3);set2.add(3);
        set2.add(null); set2.add(null);
        set2.add(1); set2.add(2);
        System.out.println("LinkedHashSet：" + set2);

        // TreeSet<E>
        System.out.println("----------TreeSet<E>----------");
        Set<String> set3 = new TreeSet<>();
        set3.add("Duke"); set3.add("James"); set3.add("Alice");
        System.out.println("TreeSet："  +set3);


        // 重複要素判定
        System.out.println("重複要素判定");
        Set<Improper> set4 = new HashSet<>();
        set4.add(new Improper(1,"bad"));
        set4.add(new Improper(1,"bad"));
        // Objectクラスのequalsが使用されてオブジェクトが参照が比較されるため要素が通過されてしまう
        System.out.println("HashSet with Improper" + set4);

        Set<Proper> set5 = new HashSet<>();
        set5.add(new Proper(2,"good"));
        set5.add(new Proper(2,"good"));
        // Objectクラスのequalsが使用されてオブジェクトの等価性が判定された結果、要素に追加されない
        System.out.println("HashSet with Proper" + set5);

    }
}
