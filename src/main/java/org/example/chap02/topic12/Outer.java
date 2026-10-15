package org.example.chap02.topic12;

/*
    エンクロージングクラス
 */
public class Outer {

    private  int number  = 100;
    static int number2 = 200;
    // メンバ内部クラス
    class Inner1 {
        void show() {
            // 外側のインスタンスメンバのアクセスが可能
            System.out.println(number);
            // 外側のstaticメンバのアクセスも可能
            System.out.println(number2);
        }
    }

    // staticなネストクラス
    static class Nested1 {
        void  show() {
//            System.out.println(number1); 外側のインスタンスメンバへのアクセスは不可能
            System.out.println(number2);
        }
    }
}
