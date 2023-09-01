package com.hema.branch;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What day of the week is it?");
        String week = sc.next();
       switch (week){
            case "Monday":
                System.out.println("studying");
                break;
            case "Tuesday":
                System.out.println("ask for help");
                break;
            case "Wensday":
                System.out.println("beer,drink");
                break;
            default:
                System.out.println("have a good rest");
        }

    }
}
