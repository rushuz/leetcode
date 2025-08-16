class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    boolean even(int num){
        int NumberOfDigits = digits(num);
        return NumberOfDigits % 2 == 0;
    }
    int digits(int num){
        if(num < 0){
            num  = num * -1;
        }
        if(num == 0){
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}