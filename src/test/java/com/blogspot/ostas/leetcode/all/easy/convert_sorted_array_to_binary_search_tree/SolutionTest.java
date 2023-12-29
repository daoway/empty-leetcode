package com.blogspot.ostas.leetcode.all.easy.convert_sorted_array_to_binary_search_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [-10,-3,0,5,9]
    Output: [0,-3,9,-10,null,5]
    Explanation: [0,-10,5,null,-3,null,9] is also accepted:
    Example 2:
    Input: nums = [1,3]
    Output: [3,1]
    Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
      Constraints:
    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums is sorted in a strictly increasing order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{-10, -3, 0, 5, 9};
//    TreeNode expected = new TreeNode(0, new TreeNode(-3, new TreeNode(-10, null, null), null),
//        new TreeNode(9, new TreeNode(5, null, null), null));
        TreeNode expected = new TreeNode(0,
                new TreeNode(-10, null, new TreeNode(-3, null, null)),
                new TreeNode(5, null, new TreeNode(9, null, null))
        );
        var result = solution.sortedArrayToBST(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3};
//    TreeNode expected = new TreeNode(3, new TreeNode(1, null, null), null);
        TreeNode expected = new TreeNode(1);
        expected.right = new TreeNode(3);

        var result = solution.sortedArrayToBST(nums);
        assertThat(result).isEqualTo(expected);
    }

}
