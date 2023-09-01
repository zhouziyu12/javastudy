package com.hema.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        int luckNumber = r.nextInt(100)+1;


        while(true){
            System.out.println("请输入您的数据：");
            Scanner sc = new Scanner(System.in);
            int guessNumber= sc.nextInt();
            if(guessNumber>luckNumber){
                System.out.println("您猜测的数字过大");
            }else if(guessNumber<luckNumber){
                System.out.println("您猜测的数字过小");
            }else{
                System.out.println("您猜对了");
                break;
            }System.out.println("正确的数字应该是："+luckNumber);
        }
    }
}
