package org.example.demo;

public class SecurityManagerDemo {

    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager());

        try {
            System.getProperty("user.home");
            System.out.println("Access to user.home allowed");
        } catch (SecurityException se) {
            System.out.println("Access denied by security manager");
        }
    }

}
