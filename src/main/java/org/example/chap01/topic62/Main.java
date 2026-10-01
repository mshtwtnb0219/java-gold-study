package org.example.chap01.topic62;

// Summary: コレクション用の便利なメソッド
// Keyword: Arraysクラス
// Level: B

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] strArray = {"D","U","K","E"};
        Arrays.sort(strArray, Comparator.naturalOrder());
        System.out.println("sort()：" + Arrays.toString(strArray));
        System.out.println("strArray：" + strArray); // 配列のオブジェクト情報ｗが出力される
        Object[] objArray = {"Java",17};
        // Arrays.sort(objArray); // ClassCastException
        int[] numArray = {1,3,5};
        int[] small = {1,3};
        int[] same = {1,3,5};
        int[] large ={5,3,1};
        System.out.println("compare()：");
        System.out.println(Arrays.compare(numArray,small) + "");
        System.out.println(Arrays.compare(numArray,same) + "");
        System.out.println(Arrays.compare(numArray,large) + "");

        System.out.println("mismatch()：");
        System.out.println(Arrays.mismatch(numArray,small));// 最初の不一致を検索する
        System.out.println(Arrays.mismatch(numArray,same));// 不一致がない場合は-1を返却する

        String[] str = {"A","B","C"};
        List<String> list1 = Arrays.asList(str);
        List<Integer> list2 = Arrays.asList(8,11,17);
//        ArrayList<Long> list3 = Arrays.asList(10L);
        System.out.println("list1：" + list1);
//        list2.add(21)  asList()は挿入不可
        List<String> stList = Arrays.asList("List","to","Array");
        String[] stArray = stList.toArray(new String[stList.size()]);




    }
}
