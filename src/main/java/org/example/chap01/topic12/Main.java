package org.example.chap01.topic12;

// Summary: オートボクシング　オートアンボクシング
// Keyword: 基本型　→　参照型　/  参照型　→　基本型　動的に変換してくれる  int → Characterみたいな変換はできない
// Level: A

public class Main {

    public static void main(String[] args) {

        // オートボクシング
        Integer obj = 100;
        // オートアンボクシング
        int i = obj;
        Long obj2 = null;
        long l = obj2;

        // nullpointerException
//        System.out.println(l);

        int i2 = 3;
        String str = String.valueOf(i2);



    }
}
