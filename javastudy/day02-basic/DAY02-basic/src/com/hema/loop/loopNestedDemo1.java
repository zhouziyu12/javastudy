package com.hema.loop;

public class loopNestedDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.println("iloveyou"+i);
            }
            }
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print("*");
            }
            System.out.println();//换行
        }
        }
    }

