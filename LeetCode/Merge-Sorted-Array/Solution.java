1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int num3[]=new int[m+n];
4          int p=m;
5          int q=n;
6          int i=0,j=0,k=0;
7          while((i<p)&&(j<q))
8          {
9              if(nums1[i]<=nums2[j])
10              {
11                  num3[k++]=nums1[i++];
12              }
13              else{
14                  num3[k++]=nums2[j++];
15              }
16          }
17          while(i<p)
18          {
19              num3[k++]=nums1[i++];
20          }
21           while(j<q)
22          {
23              num3[k++]=nums2[j++];
24          }
25           for(i=0;i<m+n;i++)
26           {
27               nums1[i]=num3[i];
28           }
29           
30          
31       }
32
33    }
34