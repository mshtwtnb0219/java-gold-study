package org.example.chap02.topic13;

// Summary: ネストクラス
// Keyword: 内部クラスとstaticなネストクラスのインスタンス化
// Level: C

public class Main {

    //  外からネストクラスのインスタンス化
    public static void main(String[] args) {
        // 内部クラス
        Outer.Inner inner = new Outer().new Inner();
        // staticネストクラス
        Outer.Nested nested = new Outer.Nested();

        inner.print();
        nested.print();

        new Outer().new Inner().print();
        Outer.Nested.print();
    }
}

// エンクロージングクラス
class Outer {
    // 内部クラス
    class Inner{
        void print() {
            System.out.println("Inner");
        }
    }
    // staticなネストクラス
    static class Nested {
        static void print() {
            System.out.println("Nested");
        }
    }

    /*
        エンクロージングクラス内からのインスタンス化
     */
    public  static void main(String argd[]) {
        Outer outer = new Outer();
        // 内部クラスのインスタンス化
        Inner inner = outer.new Inner(); // 事前にインスタンス化したOuterを指定
        inner = new Outer().new Inner(); // その場で生成したうえでInnerクラスのインスタンス生成も可能

        // staticなネストクラスのインスタンス化
        Nested nested = new Outer.Nested();
        nested = new Nested();

    }
}
