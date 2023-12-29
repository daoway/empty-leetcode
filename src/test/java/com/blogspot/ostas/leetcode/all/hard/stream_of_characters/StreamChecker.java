package com.blogspot.ostas.leetcode.all.hard.stream_of_characters;

/*
      1032. stream of characters

https://leetcode.com/problems/stream-of-characters

Design an algorithm that accepts a stream of characters and checks if a suffix of these characters is a string of a given array of strings words.
For example, if words = ["abc", "xyz"] and the stream added the four characters (one by one) 'a', 'x', 'y', and 'z', your algorithm should detect that the suffix "xyz" of the characters "axyz" matches "xyz" from words.
Implement the StreamChecker class:
StreamChecker(String[] words) Initializes the object with the strings array words.
boolean query(char letter) Accepts a new character from the stream and returns true if any non-empty suffix from the stream forms a word that is in words.

*/
class StreamChecker {
  public StreamChecker(String[] words) {
  }

  public boolean query(char letter) {
    return false;
  }
}