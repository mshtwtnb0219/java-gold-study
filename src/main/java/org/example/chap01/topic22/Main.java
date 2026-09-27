package org.example.chap01.topic22;

// Summary: ジェネリクス
// Keyword: ジェネリッククラス　ジェネリックインターフェース
// Level: B

public class Main {

    public static void main(String[] args) {

    }

    // ジェネリッククラス
    class Foo<T> {
        private T obj;
        public Foo(T obj ) {
            this.obj = obj;
        }
        public T get() {
            return obj;
        }
    }

    // ジェネリックインターフェース
    interface Bar<T ,R> {
        public R method(T t);
    }


    // コンパイルエラーになるパターン
    class Baz<E> {
        // 型パラメータを使用したインスタンス化はできない
//        private E e1 = new  E();
        // 型パラメータは非staticでありコンテキストからはアクセスできないため staticメンバに型パラメータを指定できない
//        private static E e2;
//        private static E errMethod(E e3) {
//            return e3;
//        }
    }
}
