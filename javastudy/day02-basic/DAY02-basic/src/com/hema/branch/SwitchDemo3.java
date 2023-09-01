package com.hema.branch;

public class SwitchDemo3 {
    public static void main(String[] args) {
        String week= "Wensday";
        switch (week){
            case "Monday":
                System.out.println("studying");
                break;
            case "Tuesday":
            case "Wensday":
            case"Tursday":
                System.out.println("ask for help");
                break;
            default:
                System.out.println("have a good rest");
        }
    }
}
