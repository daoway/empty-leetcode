package com.blogspot.ostas.leetcode.all.medium.number_of_good_leaf_nodes_pairs;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,null,4], distance = 3
    Output: 1
    Explanation: The leaf nodes of the tree are 3 and 4 and the length of the shortest path between them is 3. This is the only good pair.
    Example 2:
    Input: root = [1,2,3,4,5,6,7], distance = 3
    Output: 2
    Explanation: The good pairs are [4,5] and [6,7] with shortest path = 2. The pair [4,6] is not good because the length of ther shortest path between them is 4.
    Example 3:
    Input: root = [7,1,4,6,null,5,3,null,null,null,null,null,2], distance = 3
    Output: 1
    Explanation: The only good pair is [2,5].
      Constraints:
    The number of nodes in the tree is in the range [1, 210].
    1 <= Node.val <= 100
    1 <= distance <= 10
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4, null, null)),
                new TreeNode(3, null, null));
        int distance = 3;
        int expected = 1;
        var result = solution.countPairs(root, distance);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                        new TreeNode(3, new TreeNode(6, null, null), new TreeNode(7, null, null)));
        int distance = 3;
        int expected = 2;
        var result = solution.countPairs(root, distance);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(7, new TreeNode(1, new TreeNode(6, null, null), null),
                new TreeNode(4, new TreeNode(5, null, null),
                        new TreeNode(3, null, new TreeNode(2, null, null))));
        int distance = 3;
        int expected = 1;
        var result = solution.countPairs(root, distance);
        assertThat(result).isEqualTo(expected);
    }

}
