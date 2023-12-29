package com.blogspot.ostas.leetcode.all.medium.frequency_tracker;

/*
      2671. frequency tracker

https://leetcode.com/problems/frequency-tracker

Design a data structure that keeps track of the values in it and answers some queries regarding their frequencies.
Implement the FrequencyTracker class.
FrequencyTracker(): Initializes the FrequencyTracker object with an empty array initially.
void add(int number): Adds number to the data structure.
void deleteOne(int number): Deletes one occurrence of number from the data structure. The data structure may not contain number, and in this case nothing is deleted.
bool hasFrequency(int frequency): Returns true if there is a number in the data structure that occurs frequency number of times, otherwise, it returns false.

*/

class FrequencyTracker {
  private final int[] freqCount = new int[100_001];
  private final int[] count = new int[100_001];

  public void add(int number) {
    if (count[number] > 0) {
      freqCount[count[number]]--;
    }
    count[number]++;
    freqCount[count[number]]++;
  }

  public void deleteOne(int number) {
    if (count[number] == 0) {
      return;
    }
    freqCount[count[number]]--;
    count[number]--;
    freqCount[count[number]]++;
  }

  public boolean hasFrequency(int frequency) {
    return freqCount[frequency] > 0;
  }
}