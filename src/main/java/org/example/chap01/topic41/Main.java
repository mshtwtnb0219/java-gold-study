package org.example.chap01.topic41;

// Summary: コレクションフレームワーク
// Keyword: List<E>インターフェース  要素の設定/取得が得意 挿入/削除/リサイズ/並列処理が不得意  LinkedList<E> 挿入/削除/リサイズが得意 取得/並列処理が不得意  Vector<E> ArrayList<E>の同じ性質をもつ　かつマルチスレッド環境で使用するためパフォーマンスが悪い
// Level: A

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // ArrayList<E>
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new Vector<>();
        list.add(10);list.add(20);list.add(null);
        // Collection Interfaceは拡張for文
        for(Integer i :list) System.out.println(i);
        System.out.println("size()" + list.size());
        System.out.println("set()" + list.set(2,20)); //  指定した要素を削除して置き換え前の値を返却する
        System.out.println("contains()" + list.contains(50));
        System.out.println("indexOf()" + list.indexOf(20)); // 最初に検出されたインデックスを返却　ない場合は-1を返却
        System.out.println(list);
        list.add(0,100);
        System.out.println("remove()" + list.remove(1)); // 指定した要素を削除する
        System.out.println("remove()" + list.remove(Integer.valueOf(20))); // 指定した値で最初に見つかった値を削除する
//        System.out.println("remove()" + list.remove(20));
        System.out.println(list);



    }
}
