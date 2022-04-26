// Write a program to find all pairs of integers whose sum is equal to a given number
// Examples
// Input: nums = [3,2,4] , target = 6
// Output: [1,2]
public class FindPairs {

    public static void main(String args[]){
        int[] arr = twoSum(new int[]{2,7,11,15} ,9 );
        System.out.println(arr[0] + " , "+arr[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i =0; i< nums.length ; i++){
            System.out.println(i);
            for(int j = i+1 ;j <nums.length ; j++){
                System.out.println(j);
                System.out.println(nums[i]);
                System.out.println(nums[j]);
                if((nums[i]+ nums[j]) == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

}
