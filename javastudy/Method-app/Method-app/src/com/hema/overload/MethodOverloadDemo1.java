package com.hema.overload;

public class MethodOverloadDemo1 {
    public static void main(String[] args) {
        test();
        test(100);
    }
    public static void test(){
        System.out.println("====test1===");


    }
    public static void test(int a){
        System.out.println("====test100===");

    }

}
