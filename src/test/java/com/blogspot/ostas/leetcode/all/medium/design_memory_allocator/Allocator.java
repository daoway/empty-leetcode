package com.blogspot.ostas.leetcode.all.medium.design_memory_allocator;

/*
      2502. design memory allocator

https://leetcode.com/problems/design-memory-allocator

You are given an integer n representing the size of a 0-indexed memory array. All memory units are initially free.
You have a memory allocator with the following functionalities:
Allocate a block of size consecutive free memory units and assign it the id mID.
Free all memory units with the given id mID.
Note that:
Multiple blocks can be allocated to the same mID.
You should free all the memory units with mID, even if they were allocated in different blocks.
Implement the Allocator class:
Allocator(int n) Initializes an Allocator object with a memory array of size n.
int allocate(int size, int mID) Find the leftmost block of size consecutive free memory units and allocate it with the id mID. Return the block's first index. If such a block does not exist, return -1.
int free(int mID) Free all memory units with the id mID. Return the number of memory units you have freed.

*/
class Allocator {
  public Allocator(int n) {
  }

  public int allocate(int size, int mID) {
    return 0;
  }

  public int free(int mID) {
    return 0;
  }
}