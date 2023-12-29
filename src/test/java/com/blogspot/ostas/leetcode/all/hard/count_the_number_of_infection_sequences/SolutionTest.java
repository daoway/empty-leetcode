package com.blogspot.ostas.leetcode.all.hard.count_the_number_of_infection_sequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, sick = [0,4]
    Output: 4
    Explanation: Children at positions 1, 2, and 3 are not infected in the beginning. There are 4 possible infection sequences:
    - The children at positions 1 and 3 can get infected since their positions are adjacent to the infected children 0 and 4. The child at position 1 gets infected first.
    Now, the child at position 2 is adjacent to the child at position 1 who is infected and the child at position 3 is adjacent to the child at position 4 who is infected, hence either of them can get infected. The child at position 2 gets infected.
    Finally, the child at position 3 gets infected because it is adjacent to children at positions 2 and 4 who are infected. The infection sequence is [1,2,3].
    - The children at positions 1 and 3 can get infected because their positions are adjacent to the infected children 0 and 4. The child at position 1 gets infected first.
    Now, the child at position 2 is adjacent to the child at position 1 who is infected and the child at position 3 is adjacent to the child at position 4 who is infected, hence either of them can get infected. The child at position 3 gets infected.
    Finally, the child at position 2 gets infected because it is adjacent to children at positions 1 and 3 who are infected. The infection sequence is [1,3,2].
    - The infection sequence is [3,1,2]. The order of infection of disease in the children can be seen as: [0,1,2,3,4] => [0,1,2,3,4] => [0,1,2,3,4] => [0,1,2,3,4].
    - The infection sequence is [3,2,1]. The order of infection of disease in the children can be seen as: [0,1,2,3,4] => [0,1,2,3,4] => [0,1,2,3,4] => [0,1,2,3,4].
    Example 2:
    Input: n = 4, sick = [1]
    Output: 3
    Explanation: Children at positions 0, 2, and 3 are not infected in the beginning. There are 3 possible infection sequences:
    - The infection sequence is [0,2,3]. The order of infection of disease in the children can be seen as: [0,1,2,3] => [0,1,2,3] => [0,1,2,3] => [0,1,2,3].
    - The infection sequence is [2,0,3]. The order of infection of disease in the children can be seen as: [0,1,2,3] => [0,1,2,3] => [0,1,2,3] => [0,1,2,3].
    - The infection sequence is [2,3,0]. The order of infection of disease in the children can be seen as: [0,1,2,3] => [0,1,2,3] => [0,1,2,3] => [0,1,2,3].
      Constraints:
    2 <= n <= 105
    1 <= sick.length <= n - 1
    0 <= sick[i] <= n - 1
    sick is sorted in increasing order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[] sick = new int[]{0, 4};
        int expected = 4;
        var result = solution.numberOfSequence(n, sick);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int[] sick = new int[]{1};
        int expected = 3;
        var result = solution.numberOfSequence(n, sick);
        assertThat(result).isEqualTo(expected);
    }

}
