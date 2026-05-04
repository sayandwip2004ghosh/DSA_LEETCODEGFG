class Solution {
    public boolean rotateString(String s, String goal) {
        // length must match
        if (s.length() != goal.length()) return false;

        // check substring
        String doubled = s + s;
        return doubled.contains(goal);
    }
}