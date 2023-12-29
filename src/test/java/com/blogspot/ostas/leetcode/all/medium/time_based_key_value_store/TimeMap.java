package com.blogspot.ostas.leetcode.all.medium.time_based_key_value_store;

/*
      981. time based key-value store

https://leetcode.com/problems/time-based-key-value-store

Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp.
Implement the TimeMap class:
TimeMap() Initializes the object of the data structure.
void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp. If there are multiple such values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".

*/


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

record TimestampedValue(String value, int timestamp) {
}

class TimeMap {
  private final Map<String, List<TimestampedValue>> map = new TreeMap<>();

  public void set(String key, String value, int timestamp) {
    map.putIfAbsent(key, new ArrayList<>());
    map.get(key).add(new TimestampedValue(value, timestamp));
  }

  public String get(String key, int timestamp) {
    final List<TimestampedValue> history = map.get(key);
    if (history == null) {
      return "";
    }

    int start = 0;
    int end = history.size();

    while (start < end) {
      final int mid = start + (end - start) / 2;
      if (history.get(mid).timestamp() > timestamp) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }

    return start == 0 ? "" : history.get(start - 1).value();
  }
}
