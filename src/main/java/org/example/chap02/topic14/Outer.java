package org.example.chap02.topic14;

// Summary: ネストクラス
// Keyword: エンクロージングクラスのメンバへのアクセス
// Level: C

public class Outer {
    // ★staticなネストクラスのメンバ---------------------
    private String x = "x";
    private  static String y = "y";
    public static class Nested {
        String v = "v";
        static String w = "w";
        void method() {
//            System.out.println(x); staticからはstaticメンバのアクセスのみ
            System.out.println("method()：" + y + v + w);

        }

        static void staMethod() {
//            System.out.println(x);
            System.out.println("staMethod()：" + y + w);
//            System.out.println(v);
        }
    }


    // ★内部クラスのメンバ----
    private  String text = "A";
    private static String stText = "stA";
    private class Inner {
        String text = "B";
        private static String stText = "stB";
        void print(String text) {
            System.out.println("text：" + text);
            System.out.println(this.text); // 32行目のtext
            System.out.println(Outer.this.text); // 29行目のtext
        }

        static  void stPrint() {
            System.out.println("stText：" + stText); // 33行目のtext
            System.out.println(Outer.stText); // 30行目のtext
        }


    }

    public static void main(String[] args) {

        // ★staticなネストクラスのインスタンス化
        new Outer.Nested().method();
//        Outer.Nested.method(); staticからはアクセスできない
        Outer.Nested.staMethod();


        // ★内部クラスのインスタンス化
        new Outer().new Inner().print("C");
        Inner.stPrint();

    }
}

