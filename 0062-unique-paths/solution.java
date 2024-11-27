class Solution {
    public int uniquePaths(int m, int n) {
        long totalSteps = (long) m + n - 2;
        long moves = n - 1;
        long result = 1;

        // Calculate C(totalSteps, moves) (BINOMIAL COEFFICIENT) using long
        for (long i = 1; i <= moves; i++) {
            result = result * (totalSteps - moves + i) / i;
        }

        // Convert the final result to int and return
        return (int) result;
    }
}
