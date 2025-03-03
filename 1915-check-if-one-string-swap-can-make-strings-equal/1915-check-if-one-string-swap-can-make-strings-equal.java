class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int diff1 = -1, diff2 = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2)
                    return false; // More than two differences mean it's not swappable
                if (diff1 == -1) {
                    diff1 = i;
                } else {
                    diff2 = i;
                }
            }
        }

        // If no difference, strings are already equal
        if (count == 0)
            return true;

        // If exactly two differences, check if swapping makes them equal
        return count == 2 &&
                s1.charAt(diff1) == s2.charAt(diff2) &&
                s1.charAt(diff2) == s2.charAt(diff1);
    }
}