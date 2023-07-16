class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set= new HashSet<>();
              Arrays.sort(nums);
        for( int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(sum==0){
                    ArrayList<Integer> small= new ArrayList<>();
                    small.add(nums[i]);
                    small.add(nums[start]);
                    small.add(nums[end]);
                    set.add(small);
                    start++;
                    end--;
                }
                else if(sum<0){
                    start++;
                }
                else end--;
            }
        }

        List<List<Integer>> ans= new ArrayList<>();
        for(List<Integer> i:set){

            ans.add(i);
        }
return ans;
        
    }
}