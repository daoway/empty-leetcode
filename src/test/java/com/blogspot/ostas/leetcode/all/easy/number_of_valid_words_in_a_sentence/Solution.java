package com.blogspot.ostas.leetcode.all.easy.number_of_valid_words_in_a_sentence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
      2047. number of valid words in a sentence

https://leetcode.com/problems/number-of-valid-words-in-a-sentence

A sentence consists of lowercase letters ('a' to 'z'), digits ('0' to '9'), hyphens ('-'), punctuation marks ('!', '.', and ','), and spaces (' ') only. Each sentence can be broken down into one or more tokens separated by one or more spaces ' '.
A token is a valid word if all three of the following are true:
It only contains lowercase letters, hyphens, and/or punctuation (no digits).
There is at most one hyphen '-'. If present, it must be surrounded by lowercase characters ("a-b" is valid, but "-ab" and "ab-" are not valid).
There is at most one punctuation mark. If present, it must be at the end of the token ("ab,", "cd!", and "." are valid, but "a!b" and "c.," are not valid).
Examples of valid words include "a-b.", "afad", "ba-c", "a!", and "!".
Given a string sentence, return the number of valid words in sentence.

*/
class Solution {
    private static final String regex = "[a-z]*([a-z]-[a-z])?[a-z]*[!,.]?";
    public int countValidWords(String sentence) {
        int countValid = 0;
        final String[] words = Arrays.stream(sentence.split("\\s+")).filter(el -> !el.isEmpty()).toArray(String[]::new);
        for (final String word : words) {
            if (word.matches(regex)) countValid++;
        }
        return countValid;
    }
}