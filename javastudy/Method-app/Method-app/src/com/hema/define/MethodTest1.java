package com.hema.define;

public class MethodTest1 {
    public static void main(String[] args) {
        int rs = add(5);
        judge(8);
        System.out.println(rs);
    }



    public static int add(int n){
        int sum =0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        return sum;

    }


    public static void judge(int number){
        if(number%2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }


    }


}

