class Solution {
    public int reverse(int x) {
        long rev = x , l=0;
        while(rev!=0)
        {
            l*=10;
            l+=rev%10;
            rev/=10;
        }
        if(l>Integer.MAX_VALUE || l<Integer.MIN_VALUE) 
        {
            return 0;
        }
    return (int ) l;       
    }
}
