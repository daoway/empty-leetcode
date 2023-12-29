package com.blogspot.ostas.leetcode.all.hard.insert_delete_getrandom_o_one_duplicates_allowed;

/*
      381. insert delete getrandom o(1) - duplicates allowed

https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed

RandomizedCollection is a data structure that contains a collection of numbers, possibly duplicates (i.e., a multiset). It should support inserting and removing specific elements and also reporting a random element.
Implement the RandomizedCollection class:
RandomizedCollection() Initializes the empty RandomizedCollection object.
bool insert(int val) Inserts an item val into the multiset, even if the item is already present. Returns true if the item is not present, false otherwise.
bool remove(int val) Removes an item val from the multiset if present. Returns true if the item is present, false otherwise. Note that if val has multiple occurrences in the multiset, we only remove one of them.
int getRandom() Returns a random element from the current multiset of elements. The probability of each element being returned is linearly related to the number of the same values the multiset contains.
You must implement the functions of the class such that each function works on average O(1) time complexity.
Note: The test cases are generated such that getRandom will only be called if there is at least one item in the RandomizedCollection.

*/
class RandomizedCollection {
  public RandomizedCollection() {
  }

  public boolean insert(int val) {
    return false;
  }

  public boolean remove(int val) {
    return false;
  }

  public int getRandom() {
    return 0;
  }
}