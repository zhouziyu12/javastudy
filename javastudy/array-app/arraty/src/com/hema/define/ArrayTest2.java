package com.hema.define;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] face = {15,9000,10000,20000,9500,-15};
        int max = face[0];
        for (int i = 1; i <face.length ; i++) {
            if(face[i]>max){
                max=face[i];
            }

        }System.out.println(max);

    }
}
