package org.example.chap02.topic13;

// Summary: ネストクラス
// Keyword: 内部クラスとstaticなネストクラスのインスタンス化
// Level: C

public class Main {

    //  外からネストクラスのインスタンス化
    public static void main(String[] args) {
        // 内部クラス
//        Outer1.Inner inner = new Outer1().new Inner();
//        // staticネストクラス
//        Outer1.Nested nested = new Outer1.Nested();
//
//        inner.print();
//        nested.print();
//
//        new Outer1().new Inner().print();
//        Outer1.Nested.print();

        Outer.Inner inner = new Outer().new Inner();
        Outer.Nested nested = new Outer.Nested();
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
//        Outer outer = new Outer();
        // 内部クラスのインスタンス化
//        Inner inner = outer.new Inner(); // 事前にインスタンス化したOuterを指定
//        inner = new Outer().new Inner(); // その場で生成したうえでInnerクラスのインスタンス生成も可能

        // staticなネストクラスのインスタンス化
//        Nested nested = new Outer.Nested();
//        nested = new Nested();

        Outer outer = new Outer();
        // 内部クラスのインスタンス化
        Inner inner = outer.new Inner();
        inner = new Outer().new Inner();

        // staticなネストクラスのインスタンス化
        Nested nested = new Outer.Nested();
        nested = new Nested();

    }
}
