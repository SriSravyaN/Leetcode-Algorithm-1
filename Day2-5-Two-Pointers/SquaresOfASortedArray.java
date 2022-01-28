// https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int len= nums.length;
        int i=0,j= len-1;
        int[] result=new int[len];
        for(int x= len-1;x>= 0;x--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                result[x]=nums[i]*nums[i];
                i++;
            }else{
                result[x]=nums[j]*nums[j];
                j--;
            }
        }
        return result;
    
    }
}
