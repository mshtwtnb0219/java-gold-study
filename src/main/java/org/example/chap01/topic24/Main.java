package org.example.chap01.topic24;

// Summary: ジェネリクス
// Keyword: ダイヤモンド演算子
// Level: C

public class Main {

    public static void main(String[] args) {
        //　左辺のダイヤモンド演算子から型推論されるため右辺は省略可能
        Box<Integer> box1 = new Box<>();
//        Box<> err = new Box<String>();

        //メソッドの仮引数がStringで宣言されているため型推論が可能
        method(new Box<>());

        // メソッドの戻り値を代入している
        // 変数宣言時は型パラメータの指定が必要 ★
        Box<String> sBox = method();


    }


    public static void method(Box<String> box) {
        /* ～処理～*/
    }
    public static  Box<String> method() {
        return new Box<>();
    }
}
