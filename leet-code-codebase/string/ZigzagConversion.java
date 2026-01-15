/*
6. Zigzag Conversion
Solved
Medium
Topics
premium lock icon
Companies
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
(you may want to display this pattern in a fixed font for better legibility)
*/

class Solution {
    public String convert(String s, int numRows) {
        // Edge case
        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        // Initialize each row
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean goingDown = true;

        for (char c : s.toCharArray()) {
            rows[currRow].append(c);

            // Change direction at top or bottom
            if (currRow == 0) goingDown = true;
            if (currRow == numRows - 1) goingDown = false;

            currRow += goingDown ? 1 : -1;
        }

        // Combine all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}