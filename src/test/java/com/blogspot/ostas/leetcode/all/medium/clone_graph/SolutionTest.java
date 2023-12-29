package com.blogspot.ostas.leetcode.all.medium.clone_graph;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
    Output: [[2,4],[1,3],[2,4],[1,3]]
    Explanation: There are 4 nodes in the graph.
    1st node (val = 1)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
    2nd node (val = 2)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
    3rd node (val = 3)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
    4th node (val = 4)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
    Example 2:
    Input: adjList = [[]]
    Output: [[]]
    Explanation: Note that the input contains one empty list. The graph consists of only one node with val = 1 and it does not have any neighbors.
    Example 3:
    Input: adjList = []
    Output: []
    Explanation: This an empty graph, it does not have any nodes.
      Constraints:
    The number of nodes in the graph is in the range [0, 100].
    1 <= Node.val <= 100
    Node.val is unique for each node.
    There are no repeated edges and no self-loops in the graph.
    The Graph is connected and all nodes can be visited starting from the given node.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Node node1_ = new Node(1);
        Node node2_ = new Node(2);
        Node node3_ = new Node(3);
        Node node4_ = new Node(4);

        node1_.neighbors.add(node2_);
        node1_.neighbors.add(node4_);

        node2_.neighbors.add(node1_);
        node2_.neighbors.add(node3_);

        node3_.neighbors.add(node2_);
        node3_.neighbors.add(node4_);

        node4_.neighbors.add(node1_);
        node4_.neighbors.add(node3_);

        var result = solution.cloneGraph(node1);
        assertThat(result).isEqualTo(node1_);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        Node node = new Node();
        Node expected = new Node();
        var result = solution.cloneGraph(node);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        Node node = null;
        Node expected = null;
        var result = solution.cloneGraph(node);
        assertThat(result).isEqualTo(expected);
    }

}
