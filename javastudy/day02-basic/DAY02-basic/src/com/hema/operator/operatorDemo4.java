package com.hema.operator;

public class operatorDemo4
{
    public static void main(String[] args) {
        double size = 9.8;
        int storage = 16;
        boolean rs =size>=6.95 & storage>=8;
        System.out.println(rs);

        boolean rs1 =size>=6.95 | storage>=8;
        System.out.println(rs1);

        //前后相同返回false,不同返回true
        boolean rs2 =size>=6.95 ^ storage>=8;
        System.out.println(rs2);
    }
}
