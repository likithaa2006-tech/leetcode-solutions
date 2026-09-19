1class Solution {
2    public int strStr(String haystack, String needle) {
3       
4       for(int i=0;i<=haystack.length()-needle.length();i++)
5       {
6        int j=0;
7        while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
8        {
9            j++;
10        }
11        if(j==needle.length())
12        {
13            return i;
14        }
15       }
16       return -1;
17    }
18}