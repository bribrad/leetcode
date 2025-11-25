/**
 * Completed: 2022-08-18
 * Difficulty: Easy
 * 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/description/
 */

class RomanToInteger {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.toLowerCase().charAt(i);
            switch (c) {
                case('i'):
                    sum += 1;
                    break;
                case('v'):
                    if (i > 0 && s.toLowerCase().charAt(i-1) == 'i') {
                        sum += 3;
                    } else {
                        sum += 5;
                    }
                    break;
                case('x'):
                    if (i > 0 && s.toLowerCase().charAt(i-1) == 'i') {
                        sum += 8;
                    } else {
                        sum += 10;
                    }
                    break;
                case('l'):
                    if (i > 0 && s.toLowerCase().charAt(i-1) == 'x') {
                        sum += 30;
                    } else {
                        sum += 50;
                    }
                    break;
                case('c'):
                     if (i > 0 && s.toLowerCase().charAt(i-1) == 'x') {
                        sum += 80;
                    } else {
                        sum += 100;
                    }
                    break;
                case('d'):
                     if (i > 0 && s.toLowerCase().charAt(i-1) == 'c') {
                        sum += 300;
                    } else {
                        sum += 500;
                    }
                    break;
                case('m'):
                     if (i > 0 && s.toLowerCase().charAt(i-1) == 'c') {
                        sum += 800;
                    } else {
                        sum += 1000;
                    }
                    break;
                default:
                    // do nothing
            }
        }
        return sum;
    }
}