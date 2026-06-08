class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int len = nums.length;
        int[] result = new int[len];
        
        int lessCount = 0;
        int equalCount = 0;
     
        for (int num : nums) {
            if (num < pivot) lessCount++;
            else if (num == pivot) equalCount++;
        }
        
    
        int l = 0;
        int e = lessCount;
        int g = lessCount + equalCount;
        
    
        for (int num : nums) {
            if (num < pivot) {
                result[l++] = num;
            } else if (num == pivot) {
                result[e++] = num;
            } else {
                result[g++] = num;
            }
        }
        
        return result;
    }
}
