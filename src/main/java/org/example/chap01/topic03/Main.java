package org.example.chap01.topic03;

// Summary: ジェネリクス
// Keyword: 非ジェネリッククラスの場合、オブジェクトを作成する際に別の参照型で定義してそのあとからダウンキャストすると例外が発生するため
// Level: C

public class Main {

    public static void main(String[] args) {

        Box box = new Box();
        box.set("Java");
        String s = (String) box.get();
        System.out.println(s);
        box.set(10); // Integerオブジェクトでオートボクシングしている
        s = (String) box.get(); // classCastException
        // 👆String型へダウンキャストができない
        // オブジェクトがさまざまな型を扱い場合、にオブジェクトを取得する際に適切な型へダウンキャストする必要がある



    }


    // 非ジェネリッククラス
    public static class Box {
        private Object obj;
        public void set(Object obj) {
            this.obj = obj;
        }

        public Object get() {return this.obj;}


    }
}
