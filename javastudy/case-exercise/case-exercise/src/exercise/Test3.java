package exercise;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //1. 请评委打分
        Scanner sc = new Scanner(System.in);
        float[] grade = new float[5];   //存储评委分数数组

        //评委开始打分，并记录到数组中
        for (int i = 0; i < grade.length; i++) {
            System.out.print("请"+(i+1)+"号评委打分：");//输出提示
            float countGrade = sc.nextFloat();      //存储分数
            grade[i] = countGrade;                  //将分数存储到数组中
        }

        //2. 获取最高分和最低分
        //创建存放最高分和最低分的变量
        float tall = grade[0]; //存储最高分
        float tow  = grade[0]; //存储最低分

        for (int i = 0; i < grade.length; i++) {
            if(grade[i] > tall){ //获取最高分
                tall = grade[i];
            }
            if(grade[i] < tow){  //获取最低分
                tow = grade[i];
            }
        }

        //3. 计算平均值
        //存储最终值
        float result = 0;
        for (float i : grade) {
            result += i;  //五位评委分数的和
        }

        System.out.println("去除最高值："+tall+",最低值："+tow);

        //计算最终得分
        result = (result-tall-tow)/(grade.length-2);  //(总分-最高分-最低分)/(评委人数-2)=最终得分
        System.out.println("最终得分："+result);
    }
}

