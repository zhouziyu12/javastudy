package com.hema.define;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] code =new int[5];

Scanner sc = new Scanner(System.in);
        for (int i = 0; i < code.length; i++) {
           System.out.println("please enter the code");
            code[i]=sc.nextInt();
        }

        Random r = new Random();
        for (int i = 0; i < code.length; i++) {
            int index = r.nextInt(code.length);
            int temp = code[index];
            code[index]=code[i];
            code[i]=temp;


        }
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i]+" ");
        }
    }
}
