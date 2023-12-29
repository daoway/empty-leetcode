package com.blogspot.ostas.leetcode.all.easy.maximum_depth_of_n_ary_tree;

import com.blogspot.ostas.leetcode.all.common.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,null,3,2,4,null,5,6]
    Output: 3
    Example 2:
    Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
    Output: 5
      Constraints:
    The total number of nodes is in the range [0, 104].
    The depth of the n-ary tree is less than or equal to 1000.
    */
    @Test
    void example_0() {
        var solution = new Solution();

        List<Node> childrenOf3 = List.of(new Node(5), new Node(6));
        List<Node> childrenOf1 = List.of(new Node(3, childrenOf3), new Node(2), new Node(4));
        Node root = new Node(1, childrenOf1);

        int expected = 3;
        var result = solution.maxDepth(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();

        List<Node> childrenOf2 = List.of(
                new Node(3, List.of(new Node(6), new Node(7))),
                new Node(4, List.of(new Node(8), new Node(9, List.of(new Node(11), new Node(12))))),
                new Node(5, List.of(new Node(10, List.of(new Node(13), new Node(14)))))
        );
        List<Node> childrenOf1 = List.of(new Node(2, childrenOf2));
        Node root = new Node(1, childrenOf1);

        int expected = 5;
        var result = solution.maxDepth(root);
        assertThat(result).isEqualTo(expected);
    }

}
