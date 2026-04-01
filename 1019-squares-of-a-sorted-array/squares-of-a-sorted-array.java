class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[]result = new int[n];
        int left = 0;
        int right = n-1;
        int position = n-1;
        while(left<=right){
            int leftsq = nums[left]*nums[left];
            int rightsq= nums[right]*nums[right];
            if(leftsq>rightsq){
                result[position]=leftsq;
                left++;
            }
            else{
                result[position]=rightsq;
                right--;
            }
        position--;
        }
        return result;
        
    }
}