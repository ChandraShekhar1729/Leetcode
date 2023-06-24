class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1=nums1.length;
         int n2=nums2.length; 
        int[] merge=new int[n1+n2];
        
        int i=0,j=0,k=0;
        
        
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j]){
                merge[k]=nums1[i]; 
                i++;
                k++;
            }
            else{
                merge[k]=nums2[j];
                j++;
                k++;}
            }
            while(i<nums1.length){
                merge[k]=nums1[i];
            i++;
                k++;
            
        }
            while(j<nums2.length){
                merge[k]=nums2[j];
                j++;
                k++;
            }
        
        double median=0;
        
        if(merge.length%2==0){
            int mid=(((merge.length)/2)-1);
        median=(double)(merge[mid]+merge[mid+1])/2;
        
        }
        else{
            int mid=(((merge.length+1)/2)-1);
            median=(double) merge[mid];
        }
        return median;
   
        
        
        
    }
}