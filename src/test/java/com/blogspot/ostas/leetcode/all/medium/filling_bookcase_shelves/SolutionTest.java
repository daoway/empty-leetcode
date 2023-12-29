package com.blogspot.ostas.leetcode.all.medium.filling_bookcase_shelves;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: books = [[1,1],[2,3],[2,3],[1,1],[1,1],[1,1],[1,2]], shelfWidth = 4
    Output: 6
    Explanation:
    The sum of the heights of the 3 shelves is 1 + 3 + 2 = 6.
    Notice that book number 2 does not have to be on the first shelf.
    Example 2:
    Input: books = [[1,3],[2,4],[3,2]], shelfWidth = 6
    Output: 4
      Constraints:
    1 <= books.length <= 1000
    1 <= thicknessi <= shelfWidth <= 1000
    1 <= heighti <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] books = new int[][]{{1, 1}, {2, 3}, {2, 3}, {1, 1}, {1, 1}, {1, 1}, {1, 2}};
        int shelfWidth = 4;
        int expected = 6;
        var result = solution.minHeightShelves(books, shelfWidth);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] books = new int[][]{{1, 3}, {2, 4}, {3, 2}};
        int shelfWidth = 6;
        int expected = 4;
        var result = solution.minHeightShelves(books, shelfWidth);
        assertThat(result).isEqualTo(expected);
    }

}
