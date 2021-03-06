public class Solution {
    public int findMin(int[] nums) {
        int begin = 0, end = nums.length-1;
        while(begin<end){ 
            int mid = (begin + end)/2;
         
            if(nums[mid] > nums[end]) begin = mid+1;
            else if(nums[mid] < nums[end]) end = mid;
            else{
                int temp = mid+1;
                while(temp<end && nums[temp] == nums[end]) temp++;
                if(temp != end) begin = temp;
                else end = mid;
            }
         }
         return nums[begin];
    }
}
