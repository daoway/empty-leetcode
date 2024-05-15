package com.blogspot.ostas.leetcode.all.easy.ransom_note.counting;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26]; // Assuming only lowercase English letters

        for (final char c : magazine.toCharArray()) {
            counts[c - 'a']++;
        }

        // subtract occurrences of characters in ransomNote
        for (final char c : ransomNote.toCharArray()) {
            counts[c - 'a']--;
            if (counts[c - 'a'] < 0) return false;
        }

        return true;
    }
}
