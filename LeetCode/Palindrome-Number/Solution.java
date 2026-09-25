1class Solution {
2    public boolean isPalindrome(int x) 
3    { 
4      int newnum=x;
5        int num=0;
6        while(x>0)
7        {
8            int digit=x%10;
9            num =digit+(num * 10);
10            x=x/10;
11        }
12        if(num==newnum)
13        {
14            return true;
15        }
16        return false; 
17    }
18}