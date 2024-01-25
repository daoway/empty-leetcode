package com.blogspot.ostas.leetcode.all.hard.sequentially_ordinal_rank_tracker;

/*
      2102. sequentially ordinal rank tracker

https://leetcode.com/problems/sequentially-ordinal-rank-tracker

A scenic location is represented by its name and attractiveness score, where name is a unique string among all locations and score is an integer. Locations can be ranked from the best to the worst. The higher the score, the better the location. If the scores of two locations are equal, then the location with the lexicographically smaller name is better.
You are building a system that tracks the ranking of locations with the system initially starting with no locations. It supports:
Adding scenic locations, one at a time.
Querying the ith best location of all locations already added, where i is the number of times the system has been queried (including the current query).
For example, when the system is queried for the 4th time, it returns the 4th best location of all locations already added.
Note that the test data are generated so that at any time, the number of queries does not exceed the number of locations added to the system.
Implement the SORTracker class:
SORTracker() Initializes the tracker system.
void add(string name, int score) Adds a scenic location with name and score to the system.
string get() Queries and returns the ith best location, where i is the number of times this method has been invoked (including this invocation).

*/
class SORTracker {
  public SORTracker() {
  }

  public void add(String name, int score) {
  }

  public String get() {
    return null;
  }
}