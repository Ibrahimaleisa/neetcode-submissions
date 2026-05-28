class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutive = 0;
        int good = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
               consecutive++;
               if (consecutive > good){
               good = consecutive;
               }
            }
            else {
                consecutive = 0;
            }
        }
            return good;
            }
}