class Solution {
    public int[] shuffle(int[] nums, int n) {
        //hello
        int[]arr2=new int[n*2];
        System.out.println(n);
        for(int j=0;j<n;j++){
            arr2[2*j]     = nums[j];
            arr2[2*j + 1] = nums[j+n];


        }
        return arr2;
    }
}