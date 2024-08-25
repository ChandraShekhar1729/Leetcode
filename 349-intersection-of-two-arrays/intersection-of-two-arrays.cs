public class Solution {
    public int[] Intersection(int[] nums1, int[] nums2) {
        
        Array.Sort(nums1);
        Array.Sort(nums2);
    HashSet<int> result= new HashSet<int>();

        int[] visited= new int[nums2.Length];

        for( int i=0;i<nums1.Length;i++){
            for( int j=0;j<nums2.Length;j++){
                if(nums1[i]==nums2[j]&&visited[j]==0){
                    result.Add(nums2[j]);
                    visited[j]=1;
                }
            }
        }      
return result.ToArray();

    }
}