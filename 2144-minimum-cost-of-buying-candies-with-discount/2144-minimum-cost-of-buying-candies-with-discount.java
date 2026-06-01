class Solution {
    public int minimumCost(int[] cost) {
        int len = cost.length;
        if(len==1) return cost[0];
        if(len==2) return (cost[0]+cost[1]);

        int[] sortCost = Arrays.stream(cost).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();



        int total = 0;
        for(int i=0;i<len;i++)
        {
            if(i%3==2) continue;
            total = total + sortCost[i];
        }

        return total;
    }
}