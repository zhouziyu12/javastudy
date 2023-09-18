package exercise;

public class erfenchazhao {

    public static void  dupple(int[] nums){
        int temp = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {

                if (nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {11, 19, 88,13, 55, 44};
        dupple(nums);


        int key = 44;
        int max = nums.length - 1;
        int min = 0;
        int mid = -1;
        while (min<=max) {
            mid = (max + min) / 2;
            if (nums[mid] > key) {
                max = mid - 1;

            } else if (nums[mid] < key) {
                min = mid + 1;
            } else if (nums[mid] == key) {
                break;
            }
        }
        if (min>max)
        {
             System.out.println("error");
        }else {
            System.out.println(mid+1);
        }
    }



}
