class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum =0;
        
        //Finding the total sum of all the integer of array
        for (int i=0; i< nums.length; i++){
            totalSum +=nums[i];
        }

        int leftSum =0;
        
        for (int i=0; i< nums.length; i++){
            
            //Finding the right sum of integers and subtracting nums[i] to not include pivot integer in calculation
            int rightSum = totalSum - nums[i] - leftSum;
            
            //If the left sum matches to right sum then return the pivot index found
            if (rightSum == leftSum)
            return i;
            leftSum += nums[i];
        }
        
        //Return -1 if there is no pivot index
        return -1;
    }
}
