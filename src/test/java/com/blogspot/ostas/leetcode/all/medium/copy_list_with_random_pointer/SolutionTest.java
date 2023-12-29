package com.blogspot.ostas.leetcode.all.medium.copy_list_with_random_pointer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
    Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
    Example 2:
    Input: head = [[1,1],[2,1]]
    Output: [[1,1],[2,1]]
    Example 3:
    Input: head = [[3,null],[3,0],[3,null]]
    Output: [[3,null],[3,0],[3,null]]
      Constraints:
    0 <= n <= 1000
    -104 <= Node.val <= 104
    Node.random is null or is pointing to some node in the linked list.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        Node head = null; // [[7,null],[13,0],[11,4],[10,2],[1,0]];
        Node expected = null; //[[7,null],[13,0],[11,4],[10,2],[1,0]];
        var result = solution.copyRandomList(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        Node head = null; //[[1,1],[2,1]];
        Node expected = null; //[[1,1],[2,1]];
        var result = solution.copyRandomList(head);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        Node head = null;//[[3,null],[3,0],[3,null]];
        Node expected = null; //[[3,null],[3,0],[3,null]];
        var result = solution.copyRandomList(head);
        assertThat(result).isEqualTo(expected);
    }

}
