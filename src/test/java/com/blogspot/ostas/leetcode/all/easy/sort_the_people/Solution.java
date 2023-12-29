package com.blogspot.ostas.leetcode.all.easy.sort_the_people;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
      2418. sort the people

https://leetcode.com/problems/sort-the-people

You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
For each index i, names[i] and heights[i] denote the name and height of the ith person.
Return names sorted in descending order by the people's heights.

*/
public class Solution{
  static class People implements Comparable<People>{
    String name;
    int height;

    public People(String name, int height) {
      this.name = name;
      this.height = height;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      People people = (People) o;
      return height == people.height && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, height);
    }

    @Override
    public int compareTo(People o) {
      return o.height - this.height;
    }
  }
  public String[] sortPeople(String[] names, int[] heights) {
    final Set<People> set = new TreeSet<>();
    for (int i = 0; i < names.length; i++) {
      set.add(new People(names[i],heights[i]));
    }
    return set.stream().map(p -> p.name).toArray(String[]::new);
  }

}