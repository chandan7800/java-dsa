class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>(nums.length);
        for(int i=0;i<nums.length;i++){
            arr.add(index[i], nums[i]);
        }
        int[] ans=new int[arr.size()];
        for(int j=0;j<nums.length;j++){
            ans[j]=arr.get(j);
        }
        return ans;
    }
}