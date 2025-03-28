package org.example.demo;

import sun.reflect.Reflection;

public class ReflectionCallerClassDemo {

    public static void main(String[] args) {
        new ReflectionCallerClassDemo().doSomething();
    }

    public void doSomething() {
        Class<?> caller = getCallerClass();
        System.out.println("Caller class: " + caller.getName());
    }

    // This is the deprecated usage
    public Class<?> getCallerClass() {
        // 2 = skip current + immediate caller
        return Reflection.getCallerClass(2);
    }
}
