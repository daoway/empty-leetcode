package com.blogspot.ostas.leetcode.all.hard.height_of_binary_tree_after_subtree_removal_queries;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,3,4,2,null,6,5,null,null,null,null,null,7], queries = [4]
    Output: [2]
    Explanation: The diagram above shows the tree after removing the subtree rooted at node with value 4.
    The height of the tree is 2 (The path 1 -> 3 -> 2).
    Example 2:
    Input: root = [5,8,9,2,1,3,7,4,6], queries = [3,2,4,8]
    Output: [3,2,3,2]
    Explanation: We have the following queries:
    - Removing the subtree rooted at node with value 3. The height of the tree becomes 3 (The path 5 -> 8 -> 2 -> 4).
    - Removing the subtree rooted at node with value 2. The height of the tree becomes 2 (The path 5 -> 8 -> 1).
    - Removing the subtree rooted at node with value 4. The height of the tree becomes 3 (The path 5 -> 8 -> 2 -> 6).
    - Removing the subtree rooted at node with value 8. The height of the tree becomes 2 (The path 5 -> 9 -> 3).
      Constraints:
    The number of nodes in the tree is n.
    2 <= n <= 105
    1 <= Node.val <= n
    All the values in the tree are unique.
    m == queries.length
    1 <= m <= min(n, 104)
    1 <= queries[i] <= n
    queries[i] != root.val
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(3, new TreeNode(2, null, null), null),
                new TreeNode(4, new TreeNode(6, null, null),
                        new TreeNode(5, null, new TreeNode(7, null, null))));
        int[] queries = new int[]{4};
        int[] expected = new int[]{2};
        var result = solution.treeQueries(root, queries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5,
                new TreeNode(8, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(6, null, null)),
                        new TreeNode(1, null, null)),
                new TreeNode(9, new TreeNode(3, null, null), new TreeNode(7, null, null)));
        int[] queries = new int[]{3, 2, 4, 8};
        int[] expected = new int[]{3, 2, 3, 2};
        var result = solution.treeQueries(root, queries);
        assertThat(result).isEqualTo(expected);
    }

}
