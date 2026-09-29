package org.example.chap01.topic43;

// Summary: コレクションフレームワーク
// Keyword: Queue<E> Deque<E>
// Level: B

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------Queue-----------");
        Queue<String> quueu = new ArrayDeque<>();
        quueu.add("First"); quueu.offer("First");
        System.out.println("peek()：" + quueu.peek()); // First　取り出し
        System.out.println("size()：" + quueu.size()); // 2
        System.out.println("poll()：" +  quueu.poll()); // First
        System.out.println("poll()：" +  quueu.poll()); // Second
        System.out.println("size()：" + quueu.size()); // 0
        System.out.println("peek()：" + quueu.peek());
//        System.out.println("element()：" + quueu.element()); // NoSuchElementException

        System.out.println("-------Deeue-----------");
        Deque<String> deque  = new ArrayDeque<>();
        deque.add("A"); deque.addFirst("B"); deque.addLast("C");
        System.out.println("Deque：" + deque);
        System.out.println("remove()：" + deque.remove());
        System.out.println("remove()：" + deque.removeFirst());
        System.out.println("remove()：" + deque.removeLast());
        System.out.println("isEmpty()：" + deque.isEmpty());

        System.out.println("-------Deeue スタックとして使用-----------");
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First"); stack.push("Second");
        System.out.println("Stack：" + stack);
        System.out.println("pop():" + stack.pop());
        System.out.println("pop():" + stack.pop());
        System.out.println("isEmpty()：" + stack.isEmpty());


    }
}
