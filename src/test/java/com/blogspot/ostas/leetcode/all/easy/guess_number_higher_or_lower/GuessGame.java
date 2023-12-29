package com.blogspot.ostas.leetcode.all.easy.guess_number_higher_or_lower;

/*
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 */
public class GuessGame {
    public int pick;

    public int guess(int num) {
        if (num > pick) return -1;
        if (num < pick) return 1;
        return 0;
    }
}
