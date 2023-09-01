package com.hema.branch;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        System.out.println("得分：");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t >= 0 && t < 60) {
            System.out.println("您的绩效为0");
        } else if (t >= 60 && t < 80) {
            System.out.println("您的绩效为D");
        } else if (t >= 80 && t < 90) {
            System.out.println("您的绩效为C");
        } else if (t >= 90 && t <= 100) {
            System.out.println("您的绩效为A");
        }else{
            System.out.println("您录入的成绩有问题");
        }
    }
}