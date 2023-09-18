package exercise;

public class sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(25));
    }
    public static int mySqrt(int x) {
        if (x<2)
            return x;

        int left=1;
        int right=x;
        while(left<=right){
            int mid = left+(right-left)>>1;
            if(x/mid==mid){
                return mid;
            }else if(x/mid<mid) {
                right = mid-1;
            }else
                left = mid +1;

        }
        return right;
    }
}

