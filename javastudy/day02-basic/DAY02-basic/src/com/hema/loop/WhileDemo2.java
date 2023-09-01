package com.hema.loop;

public class WhileDemo2 {
    public static void main(String[] args) {
        double peakHeight =8848860;
        double paper =0.1;

        int count =0;
        while(paper<peakHeight){
            paper = paper *2;
            count++;
        }  System.out.println(count);
        System.out.println(paper);
    }




}
