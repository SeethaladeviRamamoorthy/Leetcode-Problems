class Solution {
    public String longestPalindrome(String s) {
        int start=0 , max=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=1;j++){
                int l=i,r=i+j;
                while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                int len=r-l-1;
                if(len>max){
                    max=len;
                    start=l+1;
                }
            }
        }
        return s.substring(start , start + max);
    }
}