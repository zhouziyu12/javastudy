package com.hema.scanner;


import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //开始调用SC来接收用户输入的数据
        System.out.println("请您输入您的年龄：");
        int age=sc.nextInt();
        System.out.println("年龄是："+age);
        System.out.println("请您输入您的name：");
        String name=sc.next();
        System.out.println(name+"欢迎进入系统");


    }

}
