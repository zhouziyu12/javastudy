package exercise;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        System.out.println(createcode(6));
    }
    public static String createcode(int n ){
        Random r = new Random();
        String code="";
        for (int i = 1; i <=n ; i++) {
            int type = r.nextInt(3);
                    switch (type){
                        case 0:
                            code+=r.nextInt(3);
                            break;
                        case 1 :
                            char ch1=(char)(r.nextInt(26)+65);
                            code+=ch1;
                            break;
                        case 2:
                            char ch2=(char)(r.nextInt(25)+97);
                            code+=ch2;
                            break;
                    }
        }
return code;


    }


}
