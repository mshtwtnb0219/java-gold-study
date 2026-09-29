package org.example.chap01.topic42;


// equalsやhashCodeはオーバーライドされていない
public class Improper {
    int id; String name;
    Improper(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public  String toString() {
        return  "オーバーライド";
    }
}

// recordクラスは暗黙的にequals hashCode toStringが実装されている
record Proper(int id, String name){}
