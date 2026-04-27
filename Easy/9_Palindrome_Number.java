class Solution
 {
    public boolean isPalindrome(int x)
     {
        if(x<0) return false;
        int temp = x, res = 0;
        while (temp != 0)
         {
            res *= 10;
            res += temp % 10;
            temp /= 10;
        }
        return res == x;
    }
}