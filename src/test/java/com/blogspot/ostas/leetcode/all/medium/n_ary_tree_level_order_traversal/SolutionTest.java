package com.blogspot.ostas.leetcode.all.medium.n_ary_tree_level_order_traversal;

import com.blogspot.ostas.leetcode.all.common.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,null,3,2,4,null,5,6]
    Output: [[1],[3,2,4],[5,6]]
    Example 2:
    Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
    Output: [[1],[2,3,4,5],[6,7,8,9,10],[11,12,13],[14]]
      Constraints:
    The height of the n-ary tree is less than or equal to 1000
    The total number of nodes is between [0, 104]
    */
    @Test
    void example_0() {
        var solution = new Solution();
        Node root = new Node(1,
                List.of(new Node(3, List.of(new Node(5), new Node(6))),
                        new Node(2), new Node(4))
        );
        List<List<Integer>> expected = List.of(List.of(1), List.of(3, 2, 4), List.of(5, 6));
        var result = solution.levelOrder(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        Node root = new Node(1,
                List.of(new Node(2),
                        new Node(3,
                                List.of(new Node(6), new Node(7, List.of(new Node(11, List.of(new Node(14))))))),
                        new Node(4, List.of(new Node(8, List.of(new Node(12))))),
                        new Node(5, List.of(new Node(9, List.of(new Node(13))), new Node(10))))
        );
        List<List<Integer>> expected =
                List.of(
                        List.of(1),
                        List.of(2, 3, 4, 5),
                        List.of(6, 7, 8, 9, 10),
                        List.of(11, 12, 13),
                        List.of(14)
                );
        var result = solution.levelOrder(root);
        assertThat(result).isEqualTo(expected);
    }

}
