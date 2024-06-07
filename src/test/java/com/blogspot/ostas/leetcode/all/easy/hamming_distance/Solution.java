package com.blogspot.ostas.leetcode.all.easy.hamming_distance;

/*
      461. hamming distance

https://leetcode.com/problems/hamming-distance

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, return the Hamming distance between them.

*/
class Solution {
    public int hammingDistance(int x, int y) {
        // XOR the two numbers to get a binary number where each bit is set to 1 if the corresponding bits of x and y are different
        int xor = x ^ y;

        // Count the number of 1s in the binary representation of xor (which is the Hamming distance)
        int distance = 0;
        while (xor != 0) {
            distance += xor & 1;
            xor >>= 1;
        }

        return distance;
    }

    public int hammingDistanceX(int x, int y) {
        // XOR the two numbers to get a binary number where each bit is set to 1 if the corresponding bits of x and y are different
        return (int) Integer.toBinaryString(x ^ y).chars().filter(c -> c == '1').count();
    }
}
