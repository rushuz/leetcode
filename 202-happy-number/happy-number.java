class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        while(temp != 1 && temp != 4){
            int result = 0;
            while(temp > 0){
                int rem = temp % 10;
                result += rem*rem;
                temp /= 10;
            }
            temp = result;
        }

        if(temp == 1){
            return true;
        }else{
            return false;
        }
    }
}