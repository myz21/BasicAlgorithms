class Solution {
    public int climbStairs(int n) {
        if ( n == 0){
            return 1;
        }

        if (n < 0){
            return 0;
        }
        int prev = 1;
        int curr = 1;
        int next = 0;

        for (int i = 1 ; i <= n ; i++ ){
            next = curr + prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}