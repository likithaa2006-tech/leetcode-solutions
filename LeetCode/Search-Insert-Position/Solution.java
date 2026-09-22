1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left=0,right=nums.length-1,mid=0;
4        while(left<=right)
5        {
6             mid=left+(right-left)/2;
7             if(nums[mid]==target)
8             {
9                return mid;
10             }
11             else if(nums[mid]<target)
12             {
13                left=mid+1;
14             }
15             else{
16                right=mid-1;
17             }
18        }
19        return left;
20    }
21}