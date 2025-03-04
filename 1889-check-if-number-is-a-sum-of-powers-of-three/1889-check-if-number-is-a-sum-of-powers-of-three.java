class Solution {
    static boolean backtrack(int n, int i, int curr) {
        if (curr == n) {
            return true;
        }
        if (curr > n || (int) Math.pow(3, i) > n) {
            return false;
        }
        // include
        if (backtrack(n, i + 1, curr + (int)Math.pow(3, i))) {
            return true;
        }
        // skip
        return backtrack(n, i + 1, curr);
    }

    public boolean checkPowersOfThree(int n) {
        return backtrack(n, 0, 0);
    }
}