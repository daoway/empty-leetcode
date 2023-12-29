package com.blogspot.ostas.leetcode.all.easy.find_a_corresponding_node_of_a_binary_tree_in_a_clone_of_that_tree;

import static org.assertj.core.api.Assertions.assertThat;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

  /*
    Example 1:
  Input: tree = [7,4,3,null,null,6,19], target = 3
  Output: 3
  Explanation: In all examples the original and cloned trees are shown. The target node is a green node from the original tree. The answer is the yellow node from the cloned tree.
  Example 2:
  Input: tree = [7], target =  7
  Output: 7
  Example 3:
  Input: tree = [8,null,6,null,5,null,4,null,3,null,2,null,1], target = 4
  Output: 4
    Constraints:
  The number of nodes in the tree is in the range [1, 104].
  The values of the nodes of the tree are unique.
  target node is a node from the original tree and is not null.
    Follow up: Could you solve the problem if repeated values on the tree are allowed?
  */
  @Test
  void example_0() {
    var solution = new Solution();
    TreeNode original = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode cloned = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode target = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode expected = new TreeNode(0);//mismatch method/test data
    var result = solution.getTargetCopy(original, cloned, target);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_1() {
    var solution = new Solution();
    TreeNode original = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode cloned = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode target = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode expected = new TreeNode(0);//mismatch method/test data
    var result = solution.getTargetCopy(original, cloned, target);
    assertThat(result).isEqualTo(expected);
  }

  @Test
  void example_2() {
    var solution = new Solution();
    TreeNode original = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode cloned = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode target = new TreeNode(0)//mismatch method/test data
        ;
    TreeNode expected = new TreeNode(0);//mismatch method/test data
    var result = solution.getTargetCopy(original, cloned, target);
    assertThat(result).isEqualTo(expected);
  }

}
