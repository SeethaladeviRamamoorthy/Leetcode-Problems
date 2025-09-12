class Solution {
    public int divide(int dividend, int divisor) {
        long res=(long)dividend/divisor;
       return res > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) res;
    }
}