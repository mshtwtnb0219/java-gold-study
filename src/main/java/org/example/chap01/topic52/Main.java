package org.example.chap01.topic52;

// Summary: コレクションのソート
// Keyword: Comparator<T>
// Level: C★

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        set1.add("Alexander"); set1.add("Bob");
        set1.add("Casey"); set1.add("Duke");
        System.out.println("自然順序付け:"  + set1);

        Set<String > set2 = new TreeSet<>(new SortByLength());
        set2.add("Alexander"); set2.add("Bob");
        set2.add("Casey"); set2.add("Duke");
        System.out.println("文字数ソート:"  + set2);


        // Comparator<T>インターフェースはstaticメソッドやdefaultメソッドが用意されている
        Comparator<String> comp = Comparator.nullsFirst(new SortByLength()); // nullを小さいとみなす
//        Comparator<String> comp = Comparator.nullsLat(new SortByLength()); nullを大きいと見なす
        Set<String > set3 = new TreeSet<>(comp);
        set3.add("Alexander"); set3.add("Bob");
        set3.add("Casey"); set3.add("Duke");
        set3.add(null);
        System.out.println("文字数ソート nullを小さいとみなす:"  + set3);


        // 自然順序付けの逆
        Set<String > set4 = new TreeSet<>(Comparator.reverseOrder());
        set4.add("Alexander"); set4.add("Bob");
        set4.add("Casey"); set4.add("Duke");
        System.out.println("自然順序付けの：" + set4);




    }
}

class SortByLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
