package exercise;

import java.util.Random;
import java.util.Scanner;

 public class Test6 {
    public static void main(String[] args) {
     int[] moneys = {9,666,188,520,9999};
        start(moneys);
    }
    public static void start(int[] moneys){
      Scanner sc =new Scanner(System.in);
      Random r = new Random();
      for (int i = 1; i <=5 ; i++) {
        System.out.println("输入任意内容");
        sc.next();


          while (true) {
              int index = r.nextInt(moneys.length);
              int money=moneys[index];

              if(money!=0){

                  System.out.println("congratulations"+money);
                  moneys[index]=0;
                  break;
              }
          }

      }System.out.println("finish");



    }

 }