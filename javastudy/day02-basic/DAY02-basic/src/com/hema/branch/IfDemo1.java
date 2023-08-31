package com.hema.branch;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        System.out.println("请输入这个病人的体温：");
        Scanner sc =new Scanner(System.in);
        double t = sc.nextDouble();
        if(t>37){
            System.out.println("这个人发烧了");
        }
        else{
            System.out.println("没发烧");
        }
    }
}
