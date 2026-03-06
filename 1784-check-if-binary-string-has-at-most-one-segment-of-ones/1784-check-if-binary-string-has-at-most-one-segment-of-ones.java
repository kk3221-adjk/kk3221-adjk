class Solution {
    public boolean checkOnesSegment(String s) {
        int len = s.length();
        int count = 1;
        
        for(int i=0;i<len-1;i++)
        {
            if(s.charAt(i)=='0' && s.charAt(i+1)=='1')
            {
                count++;
            }
            if(count>1)
            break;
        }
        if(count>1) return false;
        else return true;
        
    }
}