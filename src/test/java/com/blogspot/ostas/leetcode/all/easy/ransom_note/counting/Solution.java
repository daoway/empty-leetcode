package com.blogspot.ostas.leetcode.all.easy.ransom_note.counting;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26]; // Assuming only lowercase English letters

        // count occurrences of characters in magazine
        for (char c : magazine.toCharArray()) {
            counts[c - 'a']++;
        }

        // subtract occurrences of characters in ransomNote
        for (char c : ransomNote.toCharArray()) {
            counts[c - 'a']--;
        }

        // check if any count is negative, indicating not enough characters in magazine
        for (int count : counts) {
            if (count < 0) {
                return false;
            }
        }

        return true;
    }
}
