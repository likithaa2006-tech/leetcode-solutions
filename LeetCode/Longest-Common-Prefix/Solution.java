1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        String newstr="";
4        for(int i=0;i<strs[0].length();i++)
5        {
6            char lett=strs[0].charAt(i);
7            for(int j=1;j<strs.length;j++)
8            {
9                if(i>=strs[j].length()||lett!=strs[j].charAt(i))
10                {
11                    return newstr;
12                }
13            }
14            newstr+=lett;
15        }
16        return newstr;
17    }
18}