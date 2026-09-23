1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxreach=0;
4        for(int i=0;i<nums.length;i++)
5        {
6            if(i>maxreach)
7            {
8               return false;
9            }
10            maxreach=Math.max(maxreach,i+nums[i]);
11            if(maxreach>=nums.length-1)
12            {
13                return true;
14            }
15        }
16        return true;
17    }
18}