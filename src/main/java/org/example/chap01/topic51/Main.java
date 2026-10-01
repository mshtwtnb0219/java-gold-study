package org.example.chap01.topic51;

// Summary: コレクションのソート
// Keyword: Comparable<T>　compareTo()をOverride this == o (並び替えなし) this < o (this → oの順) this > o ( o → thisの順)
// Level: C

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Client> set1 = new TreeSet<>();
        set1.add(new Client("Bob"));
        set1.add(new Client("Carol"));
        set1.add(new Client("Alice"));
        System.out.println(set1);
        Set<Person> set2 = new TreeSet<>();
        // 自然順序付けが可能なのは既にComparable<String>を実装しているから
        set2.add(new Person("Duke")); // ここでClassCastExceptionが発生
    }
}

record  Client(String name) implements Comparable<Client> {
    @Override
    public int compareTo(Client o) {
        return this.name.compareTo(o.name);
    }
}
record  Person(String name){};
