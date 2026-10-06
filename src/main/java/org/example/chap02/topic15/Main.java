package org.example.chap02.topic15;

// Summary: ネストクラス
// Keyword: ローカルクラス
// Level: C

public class Main {
    private int mValue = 1;
    public void method(final int num1) {
        int num2 = 200;

        // ローカルクラス  アクセス修飾子はfinalまたはabstract
        final class Local {
            public static int lValue = 10;
            void print() {
                System.out.println(mValue);
                System.out.println(lValue);
                System.out.println(num1);
                System.out.println(num2);
                mValue = 0; lValue = 0;
//                num2 = 0;
            }

        }
        new Local().print();
    }

    public static void main(String[] args) {
        new Main().method(100);

    }
}
