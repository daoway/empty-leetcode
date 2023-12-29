package com.blogspot.ostas.leetcode.all.easy.design_hashmap;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MyHashMapTest {

  @Test
  void testPutAndGet() {
    MyHashMap myHashMap = new MyHashMap();

    // Test put and get operations
    myHashMap.put(1, 10);
    assertThat(myHashMap.get(1)).isEqualTo(10);

    myHashMap.put(2, 20);
    assertThat(myHashMap.get(2)).isEqualTo(20);

    myHashMap.put(1, 30); // Update existing key
    assertThat(myHashMap.get(1)).isEqualTo(30);

    // Test non-existent key
    assertThat(myHashMap.get(3)).isEqualTo(-1);
  }

  @Test
  void testRemove() {
    MyHashMap myHashMap = new MyHashMap();

    // Test remove operation
    myHashMap.put(1, 10);
    myHashMap.put(2, 20);
    myHashMap.remove(1);
    assertThat(myHashMap.get(1)).isEqualTo(-1);
    assertThat(myHashMap.get(2)).isEqualTo(20);
  }

  @Test
  void testCollision() {
    MyHashMap myHashMap = new MyHashMap();

    // Test collision handling
    int key1 = 1;
    int key2 = 1025; // Same bucket as key1
    myHashMap.put(key1, 10);
    myHashMap.put(key2, 20);
    assertThat(myHashMap.get(key1)).isEqualTo(10);
    assertThat(myHashMap.get(key2)).isEqualTo(20);
  }

  @Test
  void testLargeDataSet() {
    MyHashMap myHashMap = new MyHashMap();

    // Test with a large data set
    for (int i = 0; i < 1000; i++) {
      myHashMap.put(i, i * 10);
    }

    for (int i = 0; i < 1000; i++) {
      assertThat(myHashMap.get(i)).isEqualTo(i * 10);
    }
  }
}
