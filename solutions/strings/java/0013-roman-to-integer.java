// Problem: https://leetcode.com/problems/roman-to-integer/
// Time: O(n)
// Space: O(n)

class Solution {
    public int romanToInt(String s) {
        int value = 0;
        String[] symbols = new String[s.length() + 1];

        for (int i = 0; i < s.length(); i++) {
            symbols[i] = String.valueOf(s.charAt(i));
        }
        symbols[s.length()] = "P";

        for (int i = 0; i < s.length(); i++) {
            if (symbols[i].equals("I")) {
                if (symbols[i + 1].equals("V") || symbols[i + 1].equals("X")) {
                    value -= 1;
                } else {
                    value += 1;
                }
            } else if (symbols[i].equals("V")) {
                value += 5;
            } else if (symbols[i].equals("X")) {
                if (symbols[i + 1].equals("L") || symbols[i + 1].equals("C")) {
                    value -= 10;
                } else {
                    value += 10;
                }
            } else if (symbols[i].equals("L")) {
                value += 50;
            } else if (symbols[i].equals("C")) {
                if (symbols[i + 1].equals("D") || symbols[i + 1].equals("M")) {
                    value -= 100;
                } else {
                    value += 100;
                }
            } else if (symbols[i].equals("D")) {
                value += 500;
            } else if (symbols[i].equals("M")) {
                value += 1000;
            }
        }

        return value;
    }
}
