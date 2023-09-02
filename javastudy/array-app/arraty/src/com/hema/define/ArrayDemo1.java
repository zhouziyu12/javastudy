package com.hema.define;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //静态初始化数组
        int[] ages = new int[]{12, 24, 36};
        double[] scores=new double[]{89.9,99.5,59.5,89};



        int[] ages2 = {12,24,36};
        int ages3[]={12,24,36};
System.out.println(ages2[2]);
ages2[2]=2;
        System.out.println(ages2[2]);
    }
}
