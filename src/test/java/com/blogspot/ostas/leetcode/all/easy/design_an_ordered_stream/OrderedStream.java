package com.blogspot.ostas.leetcode.all.easy.design_an_ordered_stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class OrderedStream {
  private final Map<Integer, String> map;
  private int ptr; // Pointer to the next expected idKey

  public OrderedStream(int n) {
    map = new HashMap<>();
    ptr = 1; // Initialize pointer to the first idKey
  }

  public List<String> insert(int idKey, String value) {
    map.put(idKey, value);

    List<String> result = new ArrayList<>();

    // Check if the current idKey matches the expected idKey
    while (map.containsKey(ptr)) {
      result.add(map.get(ptr));
      ptr++;
    }

    return result;
  }
}
