package org.example.chap02.topic16;

// Summary: ネストクラス
// Keyword: 無名クラス
// Level: C

interface Greeting{void hello();}
public class Main {

    void sayHello() {
        Greeting obj = new Greeting() {
            @Override
            public void hello() {
                System.out.println("Hello!");
            }
        };
        obj.hello();
    }

    static Greeting getGreeting() {
        return  new Greeting() {
            @Override
            public void hello() {
                System.out.println("マイクロ");
            }
        };
    }

    public static void main(String[] args) {

        new Main().sayHello();
        Greeting greeting = getGreeting();
        greeting.hello();




    }
}
