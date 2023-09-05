package com.hema.define;

public class MethodDemo2 {
    public static void main(String[] args) {
        printhelloworld(4);
        System.out.println("----------------");
        printhelloworld(1);
    }


    public static void printhelloworld(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Helloworld");
        }

    }

}
