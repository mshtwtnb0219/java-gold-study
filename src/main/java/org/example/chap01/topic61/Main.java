package org.example.chap01.topic61;

// Summary: コレクション用の便利なメソッド
// Keyword: Collectionsクラス binarySearchは順序付けである必要がある
// Level: A

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        Collections.addAll(list, 1,10,5,0); // 第一引数に操作対象のlist
        System.out.println("addAll()：" + list);
        Collections.reverse(list); // listを逆順
        System.out.println("reverse()：" + list);
        Collections.sort(list);
        System.out.println("sort()：" + list);
        System.out.println("binarySearch()" +
                Collections.binarySearch(list,10));

        List rawList = new ArrayList();
        Collections.addAll(rawList,0,"One",1.5);
        System.out.println("rawlist：" + rawList);
        Collections.sort(rawList); // 異なる型が混在しているためClassCastExceptionが発生する

    }
}
