package org.example.chap02.topic11;

// Summary: ネストクラス
// Keyword:　static：クラスの属する 非static：インスタンスに属する メンバ：クラス直下にある ローカル：メソッドなどのブロック内にある
// Level: C

public class Main {

    // 内部クラス
    class Inner{}
    // staticなネストクラス
    static  class StaticNested{}

    void test() {
        // ローカルクラス
        class Local {}

        // 無名クラス
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };
    }



    public static void main(String[] args) {

    }
}
