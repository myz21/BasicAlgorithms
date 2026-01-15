class Solution {
    public int fib(int n) {

        if (n <= 1){
            return n;
        }

        int prev = 0;
        int curr = 1;
        int next = 0;

        for (int i = 2; i <= n; i++){

            next = prev + curr;

            prev = curr;
            curr = next;
        }

        return curr;

    }
}