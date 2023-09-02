package com.hema.define;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        double[] scores = new double[6];
        Scanner sc=new Scanner(System.in);
double sum =0;
        for (int i = 0; i < 6; i++) {
            System.out.println("输入第"+(i+1)+"个评委的分数");
            double score=sc.nextDouble();
            scores[i]=score;
          sum+=scores[i];



        }double avg =sum/scores.length;
        System.out.println("平均分应该是");
        System.out.println(avg);
    }
}
