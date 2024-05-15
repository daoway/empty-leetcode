package com.blogspot.ostas.leetcode.all.easy.number_of_even_and_odd_bits;

/*
      2595. number of even and odd bits

https://leetcode.com/problems/number-of-even-and-odd-bits

You are given a positive integer n.
Let even denote the number of even indices in the binary representation of n (0-indexed) with value 1.
Let odd denote the number of odd indices in the binary representation of n (0-indexed) with value 1.
Return an integer array answer where answer = [even, odd].

*/

/**
 *   In the given code, the indices are 0-indexed, which means the least significant bit (LSB) has index 0.
 *   Therefore, in the binary representation, the LSB is at index 0, which is an even index.
 *   However, in the current implementation, it's considered as an odd index.
 *   We need to adjust the logic to correctly count the bits at even and odd indices.
 *   --
 *   We shift n to the right (n >>= 1) to examine each bit, and we keep track of the index to determine whether it's at an even or odd position.
 */
class Solution {
    public int[] evenOddBit(int n) {
        int even = 0, odd = 0;
        int index = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (index % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            n >>= 1;
            index++;
        }
        return new int[]{even, odd};
    }
}

