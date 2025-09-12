class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLength=0;
        HashSet<Character> seen=new HashSet<>();
        int left=0,right=0;
        while(right < n){
            char currentChar=s.charAt(right);
            while(seen.contains(currentChar)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(currentChar);
            maxLength=Math.max(maxLength,right-left+1);
            right++;

        }
        return maxLength;
    }
}