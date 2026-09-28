package org.example.chap01.topic26;

// Summary: ジェネリクス
// Keyword: 境界付き型パラメータ
// Level: B


// 型パラメータの指定
// <型パラメータ extends 境界の型>
class  Foo<T extends  Number>{}
class Bar<T,X extends  T> {}
public class Main {


    static <T extends Comparable<T>> void method(T t1 ,T t2) {
        if(t1.compareTo(t2) > 0) System.out.println(t1);
    }

    public static void main(String[] args) {
        Foo<Integer> foo = new Foo<>();

        // Number型またはそのサブクラスのみ型パラメータの指定が可能
//        Foo<Object> foo1 = new Foo<>();

        // Number型とNumber型を継承したDouble型を指定
        Bar<Number , Double> bar = new Bar<>();


        method(10,0);

    }
}
