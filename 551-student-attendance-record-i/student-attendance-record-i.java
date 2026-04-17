class Solution {
    public boolean checkRecord(String s) {
        int absences = 0;
        int consecutiveLate = 0;

        for (char ch : s.toCharArray()) {

            if (ch == 'A') {
                absences++;
                if (absences >= 2) return false;
                consecutiveLate = 0; // reset late count
            } 
            else if (ch == 'L') {
                consecutiveLate++;
                if (consecutiveLate >= 3) return false;
            } 
            else { // 'P'
                consecutiveLate = 0;
            }
        }

        return true;
    }
} 
    