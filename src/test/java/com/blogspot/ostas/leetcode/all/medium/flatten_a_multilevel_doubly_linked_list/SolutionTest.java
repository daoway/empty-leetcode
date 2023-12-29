package com.blogspot.ostas.leetcode.all.medium.flatten_a_multilevel_doubly_linked_list;

import org.junit.jupiter.api.Test;

class SolutionTest {

    /*
      Example 1:
    Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
    Output: [1,2,3,7,8,11,12,9,10,4,5,6]
    Explanation: The multilevel linked list in the input is shown.
    After flattening the multilevel linked list it becomes:
    Example 2:
    Input: head = [1,2,null,3]
    Output: [1,3,2]
    Explanation: The multilevel linked list in the input is shown.
    After flattening the multilevel linked list it becomes:
    Example 3:
    Input: head = []
    Output: []
    Explanation: There could be empty list in the input.
      Constraints:
    The number of Nodes will not exceed 1000.
    1 <= Node.val <= 105
      How the multilevel linked list is represented in test cases:
    We use the multilevel linked list from Example 1 above:
     1---2---3---4---5---6--NULL
         |
         7---8---9---10--NULL
             |
             11--12--NULL
    The serialization of each level is as follows:
    [1,2,3,4,5,6,null]
    [7,8,9,10,null]
    [11,12,null]
    To serialize all levels together, we will add nulls in each level to signify no node connects to the upper node of the previous level. The serialization becomes:
    [1,    2,    3, 4, 5, 6, null]
             |
    [null, null, 7,    8, 9, 10, null]
                   |
    [            null, 11, 12, null]
    Merging the serialization of each level and removing trailing nulls we obtain:
    [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
    */
    @Test
    void example_0() {
//      var solution = new Solution();
//      Node head=[1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12];
//      Node expected = [1,2,3,7,8,11,12,9,10,4,5,6];
//      var result = solution.flatten(head);
//      assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
//      var solution = new Solution();
//      Node head=[1,2,null,3];
//      Node expected = [1,3,2];
//      var result = solution.flatten(head);
//      assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
//      var solution = new Solution();
//      Node head=[];
//      Node expected = [];
//      var result = solution.flatten(head);
//      assertThat(result).isEqualTo(expected);
    }

}
