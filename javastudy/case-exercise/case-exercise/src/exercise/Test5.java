package exercise;

public class Test5 {
    public static void main(String[] args) {
        int arr[]={33,88,77};
        int[] arr2 = copy(arr);
        printarr(arr2);

    }
    public static void printarr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i== arr.length-1? arr[i]:arr[i]+",");
        }
        System.out.print("]");

    }
    public static int[] copy(int[] arr){
        int[] arr2=new int[arr.length];

        for (int i = 0; i <arr.length; i++) {
            arr2[i]=arr[i];
        }
        return arr2;


    }

}
