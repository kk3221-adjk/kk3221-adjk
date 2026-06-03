class Solution {

    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int result1 = findFinishTime(landStartTime, landDuration,
                                     waterStartTime, waterDuration);

        int result2 = findFinishTime(waterStartTime, waterDuration,
                                     landStartTime, landDuration);

        int res = Math.min(result1, result2);

        return res;
    }

    public int findFinishTime(int[] start1, int[] dur1,
                              int[] start2, int[] dur2) {

        int finish1 = Integer.MAX_VALUE;
        int finish2 = Integer.MAX_VALUE;

        // Activity 1
        for (int i = 0; i < start1.length; i++) {
            finish1 = Math.min(finish1, start1[i] + dur1[i]);
        }

        // Activity 2
        for (int i = 0; i < start2.length; i++) {
            int f2 = Math.max(finish1, start2[i]) + dur2[i];
            finish2 = Math.min(finish2, f2);
        }

        return finish2;
    }
}