package com.blogspot.ostas.leetcode.all.easy.n_ary_tree_preorder_traversal;

import com.blogspot.ostas.leetcode.all.common.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,null,3,2,4,null,5,6]
    Output: [1,3,5,6,2,4]
    Example 2:
    Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
    Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
      Constraints:
    The number of nodes in the tree is in the range [0, 104].
    0 <= Node.val <= 104
    The height of the n-ary tree is less than or equal to 1000.
      Follow up: Recursive solution is trivial, could you do it iteratively?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Node> childrenOf3 = List.of(new Node(5), new Node(6));
        List<Node> childrenOf1 = List.of(new Node(3, childrenOf3), new Node(2), new Node(4));
        Node root = new Node(1, childrenOf1);
        List<Integer> expected = List.of(1, 3, 5, 6, 2, 4);
        var result = solution.preorder(root);
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
        List<Integer> expected = List.of(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10);
        var result = solution.preorder(root);
        assertThat(result).isEqualTo(expected);
    }
}
