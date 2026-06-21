class Solution {
    // hello
    public int largestAltitude(int[] gain) {
        int ans=0;
        int total=0;
        for(int i=0;i<gain.length;i++){
            total+=gain[i];
            if(total>ans){
                ans=total;
            }
        }
        return ans;

    }
}