package com.blogspot.ostas.leetcode.all.easy.unique_morse_code_words;

/*
      804. unique morse code words

https://leetcode.com/problems/unique-morse-code-words

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:
'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.

*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
  private static final HashMap<Character, String> morseAlphabet = new HashMap<>();
  static {
    // Put each lowercase letter and its corresponding Morse code into the HashMap
    morseAlphabet.put('a', ".-");
    morseAlphabet.put('b', "-...");
    morseAlphabet.put('c', "-.-.");
    morseAlphabet.put('d', "-..");
    morseAlphabet.put('e', ".");
    morseAlphabet.put('f', "..-.");
    morseAlphabet.put('g', "--.");
    morseAlphabet.put('h', "....");
    morseAlphabet.put('i', "..");
    morseAlphabet.put('j', ".---");
    morseAlphabet.put('k', "-.-");
    morseAlphabet.put('l', ".-..");
    morseAlphabet.put('m', "--");
    morseAlphabet.put('n', "-.");
    morseAlphabet.put('o', "---");
    morseAlphabet.put('p', ".--.");
    morseAlphabet.put('q', "--.-");
    morseAlphabet.put('r', ".-.");
    morseAlphabet.put('s', "...");
    morseAlphabet.put('t', "-");
    morseAlphabet.put('u', "..-");
    morseAlphabet.put('v', "...-");
    morseAlphabet.put('w', ".--");
    morseAlphabet.put('x', "-..-");
    morseAlphabet.put('y', "-.--");
    morseAlphabet.put('z', "--..");
  }
  public int uniqueMorseRepresentations(String[] words) {
    final Set<String> set = new HashSet<>();
    for (final String word : words) {
      final StringBuilder sb = new StringBuilder();
      for (final char c : word.toCharArray()) {
        sb.append(morseAlphabet.get(c));
      }
      set.add(sb.toString());
    }
    return set.size();
  }


}