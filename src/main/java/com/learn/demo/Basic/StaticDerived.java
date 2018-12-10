package com.learn.demo.Basic;

public class StaticDerived {
    public static void run() {
        Base subClass = new Subclass();
        subClass.print();
        subClass.display();
        ((Subclass) subClass).display("Hello world");
    }

    public static class Base {
        public static void display() {
            System.out.println("Display message from Base class");
        }

        public Object print() {
            System.out.println("Print message from Base class");
            return 0;
        }
    }

    public static class Subclass extends Base {
        public static void display() {
            System.out.println("Display message from Subclass");
        }

        public static void display(String message) {
            System.out.println(String.format("Display message from Subclass: %s", message));
        }

        @Override
        public Integer print() {
            System.out.println("Print message from Subclass");
            return 0;
        }
    }

}

