package exercise;

public class Test1 {
    public static void main(String[] args) {
        double price = calculate(1000,8,"first");
        System.out.println("price is"+price);
    }



    public static double calculate(double price,int month,String type) {
        if (month >= 5 && month <= 10) {
            switch (type) {
                case "first":
                    price = price * 0.9;
                    break;
                case "economy":
                    price = price * 0.85;
                    break;
            }
        } else {
            switch (type) {
                case "first":
                    price = price * 0.7;
                    break;
                case "economy":
                    price = price * 0.65;
                    break;


            }


        }
        return price;
    }
}
