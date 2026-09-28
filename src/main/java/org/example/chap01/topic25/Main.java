package org.example.chap01.topic25;

// Summary: ジェネリクス
// Keyword: ジェネリックメソッド(staticで宣言可能)   ジェネリクスクラス(インターフェース) staticで宣言が不可能
// Level: C

import java.util.ArrayList;
import java.util.List;

public class Main {

    //ジェネリクスを指定していないclass
    <T> List<T> foo() {
        return new ArrayList<T>();
    }


    static <E> void bar (List<E> list) {
        for (E e :list ) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();

        List<Integer> list1 = obj.foo();
        List<Integer> list2 = obj.<Integer>foo();
        list1.add(10);
        list2.add(20);
        // 型指定もできるし、省略もできる
        Main.bar(list1);
        Main.<Integer>bar(list2);

    }
}

