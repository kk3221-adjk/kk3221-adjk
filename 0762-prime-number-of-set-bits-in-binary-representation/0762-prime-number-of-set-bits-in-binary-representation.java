class Solution {
    public int countPrimeSetBits(int left, int right) {

        int count = 0;

        for(int i=left;i<=right;i++)
        {
            int SetBits = Integer.bitCount(i);
            int c =0;
            for(int j=1;j<=SetBits;j++)
            {
                if(SetBits%j==0) c++;
            }
            if(c==2) count++;
            else continue;
        }
        return count;
    }
}