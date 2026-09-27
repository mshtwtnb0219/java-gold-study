package org.example.chap01.topic11;

// Summary: ラッパークラス
// Keyword: 基本型→参照型(ボクシング) valueOf() 参照型→基本型(アンボクシング) xxxValue()
// Level: A

public class Main {

    public static void main(String[] args) {
        // 基本型
        // byte short int float char long boolean dobule
        // 値そのものが入る 変数aには影響しない
        int a = 10;
        int b = a;

        b = 20;
        System.out.println(a);
        System.out.println(b);


        // 基本型 8種類以外は参照型
        // String 配列　クラス　インタフェース enum record
        // 変数にはオブジェクトそのものではなく、そのオブジェクトを参照するための値が入る
        String str = "test";
        int[] arr = {19,1,1};
//        Person p = new Person();

        int[] c = {10,20};
        int[] d = c;
        d[0] = 100;
        System.out.println(c[0]); // 100が出力される

        // 基本データ→参照データ　変換　ラッパークラスを使用 nullを扱うことができる
        // int 型　→　Integerオブジェクト
        int i = 10;
        Integer obj = Integer.valueOf(i);
        // Integerオブジェクト →　int型
        int i2 = obj.intValue();

        long lValue = 10L;
        Long obj2 = Long.valueOf(lValue);

        int i3 = 1;
        Integer obj3 = Integer.valueOf(i3);

        int i4 = obj3.intValue();


    }
}
