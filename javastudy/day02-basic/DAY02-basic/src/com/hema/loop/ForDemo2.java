package com.hema.loop;

public class ForDemo2 {
    public static void main(String[] args) {


        int max = 0;
        for (int i = 1; i <= 100; i++) {

            max += i;

        }
        System.out.println(max);


        int max1 = 0;
        System.out.println("------------");
        for (int i = 1; i < 100; i += 2) {
            max1 += i;
        }
        System.out.println(max1);


        int sum2=0;
        System.out.println("------------");
        for (int i = 1; i <= 100; i++) {
            if (i %2==1){
                sum2 +=i;
            }

        }System.out.println(sum2);

    }
}