package org.example.chap01.topic23;


// ジェネリッククラス
public class Box <T>{
        private T obj;
        public void set(T obj) {
            this.obj = obj;
        }
        public T get() {
            return obj;
        }

}


