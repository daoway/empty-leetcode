package com.blogspot.ostas.leetcode.all.hard.count_the_number_of_infection_sequences;

/*
      2954. count the number of infection sequences

https://leetcode.com/problems/count-the-number-of-infection-sequences

You are given an integer n and a 0-indexed integer array sick which is sorted in increasing order.
There are n children standing in a queue with positions 0 to n - 1 assigned to them. The array sick contains the positions of the children who are infected with an infectious disease. An infected child at position i can spread the disease to either of its immediate neighboring children at positions i - 1 and i + 1 if they exist and are currently not infected. At most one child who was previously not infected can get infected with the disease in one second.
It can be shown that after a finite number of seconds, all the children in the queue will get infected with the disease. An infection sequence is the sequential order of positions in which all of the non-infected children get infected with the disease. Return the total number of possible infection sequences.
Since the answer may be large, return it modulo 109 + 7.
Note that an infection sequence does not contain positions of children who were already infected with the disease in the beginning.

*/
class Solution {
  public int numberOfSequence(int n, int[] sick) {
    return 0;
  }
}