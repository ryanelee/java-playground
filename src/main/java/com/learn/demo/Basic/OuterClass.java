package com.learn.demo.Basic;

public class OuterClass {
    public static String message = "Nested Class Demo";

    public static class NestedClass {
        public void printMessage() {
            System.out.println(String.format("Message from %s", message));
        }
    }

    public class InnerClass {
        public void printMessage() {
            System.out.println(String.format("Message from %s", message));
        }
    }
}
