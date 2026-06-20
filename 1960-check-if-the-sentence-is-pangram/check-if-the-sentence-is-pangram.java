class Solution {
    public boolean checkIfPangram(String sentence) {
        char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        boolean ans=true;
        for(int i=0;i<arr.length;i++){
            boolean found = false;
            char target=arr[i];
            for(int j=0;j<sentence.length();j++){
                if(sentence.charAt(j)==target){
                    found=true;
                    break;

                }
            }
            if(found==false){
                ans=false;
                break;
            }


            
        }
        return ans;
            

    } 
}