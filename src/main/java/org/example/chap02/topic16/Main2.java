package org.example.chap02.topic16;


interface  Greeting2{void hello();}

class Animal {
    void eat(){
        System.out.println("Animal.eat()");
    }
}

public class Main2 {

    public static void main(String[] args) {

        // interface実装
        Greeting2 g = new Greeting2() {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
        g.hello();


        // クラスの継承
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("Animal.eat()2");
            }
        };

        a.eat();
    }



}
