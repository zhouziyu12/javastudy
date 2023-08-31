package com.hema.operator;

public class operatorDemo5 {
    public static void main(String[] args) {
        double score = 48.6;
        String rs = score >= 60 ? "jige" : "bujige";
        System.out.println(rs);


        int a = 99;
        int b = 45;
        int max = a > b ? a : b;
        System.out.println(max);



        int i =10;
        int j =45;
        int k =60;
        int temp=i>j?i:j;
        int max2=temp>k?temp:k;
        System.out.println(max2);

    }
}