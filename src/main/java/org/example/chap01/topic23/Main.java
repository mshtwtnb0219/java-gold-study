package org.example.chap01.topic23;

// Summary: ジェネリクス
// Keyword: ジェネリクスの使用
// Level: A

public class Main {

    public static void main(String[] args) {
        // オブジェクトの生成
        Box<String> box = new Box<String>();
        box.set("Gold");
        String str = box.get();

//        box.set(1);  コンパイルエラー
        Box<Integer> box2 = new Box<Integer>();
        box2.set(10);

//        Box<int> box2 = new Box<int>();  プリミティブ型は指定できない
        Box box4 = new Box();
        box4.set(true);
        // 型パラメータを指定しないこと可能であるが、取得時は適切なダウンキャストが必要
        Boolean b = (Boolean) box4.get();

    }



}
