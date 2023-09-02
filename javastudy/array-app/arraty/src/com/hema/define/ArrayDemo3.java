package com.hema.define;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] money={16,26,36,6,100};
        int sum=0;
        for (int i = 0; i < money.length; i++) {
            sum=sum+money[i];
        }

        System.out.println(sum);

    }
}
