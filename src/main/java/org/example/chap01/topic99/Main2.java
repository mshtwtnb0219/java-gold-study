package org.example.chap01.topic99;

import java.util.ArrayList;
import java.util.List;

// ChatGpt復習
public class Main2 {

    // ジェネリッククラス
    <T> List<T> foo() {
        return new ArrayList<>();
    }

    // ジェネリッククラス　static
    static  <E> void bar(List<E> list) {

    }

    public static void main(String[] args) {
        Double d = method(10);
        System.out.println(d);

        // 拡大変換 小さい範囲の基本型から大きい範囲の基本型に変換する
        // 整数 byte →　short →　int →　long
        // 浮動小数点  int →　long → float →　double


    }

    private  static Double method(int a){
        return (double)Long.valueOf(a);

    }
}


// ジェネリッククラス
class Foo<T> {
    private T value;
    public Foo(T value) {
        this.value = value;
    }
    public  T getValue() {
        return value;
    }

    // 型パラメータを指定したインスタンス化はできない
//    public T method(T value) {
//        return new T();
//    }

    // staticは使用できない　FooクラスのTはインスタンス毎で指定する型のため
//    public static void methodF(T t) {
//
//    }
}