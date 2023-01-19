package org.example.main;

public class OuterClass {
    static int i = 5;

    static class Inner {
        int i0 = 0;

        public static void display() {
            System.out.println(" Value of i: " + i);
        }
    }

    public static void main(String[] args) {
//        OuterClass.Inner i = new OuterClass.Inner();
//        Inner.display();
//        i.i0 = 6;
//        Inner.display();
    }
}