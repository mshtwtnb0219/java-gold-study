package org.example.chap01.topic28;

// Summary: ジェネリクス
// Keyword: 境界付きワイルドカード型 上限境界ワイルドカード(<? extends 境界の型>)  下限境界ワイルドカード(<? super 境界の型>)
// Level:C

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void testUpperBnd(List<? extends  Number> list) {
        list.add(null);
//        list.add(Integer.valueOf(10));
        Number n = list.get(0);
    }

    static void testLowerBnd(List<? super Number> list) {
        list.add(Integer.valueOf(10));
//        list.add(new Object());
        Object o = list.get(0);
//        Number n = list.get(1);

    }

    public static void main(String[] args) {
        List<Object> oList = new ArrayList<>();oList.add(1);
        List<Number> nList = new ArrayList<>();nList.add(1);
        List<Integer> iList = new ArrayList<>();iList.add(1);
//        testUpperBnd(oList); 上限がNumber
        testUpperBnd(nList);
        testUpperBnd(iList);
        testLowerBnd(oList);
        testLowerBnd(nList);
//        testLowerBnd(iList); 下限がNumber Integer型は引数に指定できない

        var list = new ArrayList<>();
        list.add(10);
        list.add("java");

        Integer a = 100;
        Integer b = 100;
        Integer c = 1000;
        Integer d = 1000;

        System.out.println(a== b);
        System.out.println(c == d);
    }
}
