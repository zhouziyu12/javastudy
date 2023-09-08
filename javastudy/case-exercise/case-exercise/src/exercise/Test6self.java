package exercise;

import java.util.Random;
import java.util.Scanner;

public class Test6self {
    public static void main(String[] args) {
        int number[]={2288,77,55,4};
        start(number);

    }
    public static void start(int[] numbers){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("ENTER");
            sc.nextInt();

            while (true) {
                int index= r.nextInt(numbers.length);
                int money = numbers[index];

                if(money!=0){
                    System.out.println("congratulations"+money);
                    numbers[index]=0;
                    break;
                }
            }


        }System.out.println("finish");





    }


}
