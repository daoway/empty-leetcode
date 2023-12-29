package com.blogspot.ostas.leetcode.all.medium.maximum_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,2,1,6,0,5]
    Output: [6,3,5,null,2,0,null,null,1]
    Explanation: The recursive calls are as follow:
    - The largest value in [3,2,1,6,0,5] is 6. Left prefix is [3,2,1] and right suffix is [0,5].
    - The largest value in [3,2,1] is 3. Left prefix is [] and right suffix is [2,1].
        - Empty array, so no child.
        - The largest value in [2,1] is 2. Left prefix is [] and right suffix is [1].
            - Empty array, so no child.
            - Only one element, so child is a node with value 1.
    - The largest value in [0,5] is 5. Left prefix is [0] and right suffix is [].
        - Only one element, so child is a node with value 0.
        - Empty array, so no child.
    Example 2:
    Input: nums = [3,2,1]
    Output: [3,null,2,null,1]
      Constraints:
    1 <= nums.length <= 1000
    0 <= nums[i] <= 1000
    All integers in nums are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 1, 6, 0, 5};
        TreeNode expected =
                new TreeNode(6, new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1, null, null))),
                        new TreeNode(5, new TreeNode(0, null, null), null));
        var result = solution.constructMaximumBinaryTree(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 1};
        TreeNode expected = new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1, null, null)));
        var result = solution.constructMaximumBinaryTree(nums);
        assertThat(result).isEqualTo(expected);
    }

}
