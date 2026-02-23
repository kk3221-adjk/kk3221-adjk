class Solution {
    public int binaryGap(int n) {
        
        String BV = Integer.toBinaryString(n);

        int len = BV.length();

        int MaxGap = 0;
        int prev = -1;

        for(int i=0;i<len;i++)
        {
            char ch = BV.charAt(i);
            if(ch=='1')
            {
                if(prev!=-1)
                {
                    int gap = i-prev;
                    MaxGap = Math.max(MaxGap,gap);
                }
                prev = i;
            }
        }

        return MaxGap;
    }
}