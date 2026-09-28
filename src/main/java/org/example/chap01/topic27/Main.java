package org.example.chap01.topic27;

// Summary: ジェネリクス
// Keyword: 非境界ワイルドカード型
// Level: C

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Number[] nArr = {0,1,2};
        Number[] iArr = {0,1,2};
        nArr = iArr;
//        nArr[0] = 3.0;  Integer型の配列のためdouble型は代入できない ArrayStoreExceptionがスロー

        List<Number> nlist = new ArrayList<>(); nlist.add(1);
        List<Integer> ilist = new ArrayList<>(); ilist.add(1);
//        nlist = ilist;  別の参照型は代入できない
//        methodObj(nlist); IntegerとObjectの互換性がないためコンパイルエラーが発生する

        // List<?>を指定することでNumber型のパラメータ指定ができる
        methodWcard(nlist);


    }

    static void methodObj(List<Object> list)  {
        for(Object e: list) System.out.println(e);
    }

    static void methodWcard(List<?> list)  {
        for(Object e: list) System.out.println(e);
//        list.add(2); list.add(new Object());
        list.add(null);
    }



}
