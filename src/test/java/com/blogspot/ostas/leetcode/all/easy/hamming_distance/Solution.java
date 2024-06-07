package com.blogspot.ostas.leetcode.all.easy.hamming_distance;

/*
      461. hamming distance

https://leetcode.com/problems/hamming-distance

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, return the Hamming distance between them.

*/
class Solution {
    public int hammingDistance(int x, int y) {
        var binStringX = Integer.toBinaryString(x);
        var binStringY = Integer.toBinaryString(y);

        // Pad the shorter binary string with leading zeros
        int maxLength = Math.max(binStringX.length(), binStringY.length());
        binStringX = String.format("%" + maxLength + "s", binStringX).replace(' ', '0');
        binStringY = String.format("%" + maxLength + "s", binStringY).replace(' ', '0');

        int mid = Math.min(binStringX.length(), binStringY.length());
        int distance = 0;
        for (int i = 0; i < mid; i++) {
            if (binStringX.charAt(i) != binStringY.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }
}