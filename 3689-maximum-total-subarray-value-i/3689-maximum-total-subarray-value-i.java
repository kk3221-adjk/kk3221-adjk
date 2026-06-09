class Solution {
    public long maxTotalValue(int[] nums, int k) {
        
        long min = Arrays.stream(nums).min().getAsInt();
        long max = Arrays.stream(nums).max().getAsInt();

        long result = (max-min)*k;

        return result;
    }
}