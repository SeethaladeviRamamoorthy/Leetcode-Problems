class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int curr;
        for (int i=0;i<s.length();i++) {
             curr = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
           int next=0;
           if(i+1<s.length()){
            next=switch(s.charAt(i+1)){
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            
           };
           }
           if(curr<next){
            sum-=curr;
           }
           else{
            sum+=curr;
           }
        }
        return sum;
    }
}
