1class Solution {
2    public boolean isPalindrome(String s) {
3        s=s.toLowerCase();
4        String newstr="";
5        for(char i:s.toCharArray())
6        {
7            if(Character.isLetterOrDigit(i))
8            {
9                newstr+=i;
10            }
11        }
12        String rev="";
13        for(int i=newstr.length()-1;i>=0;i--)
14        {
15            rev+=newstr.charAt(i);
16        }
17        return rev.equals(newstr);
18    }
19    
20    
21}