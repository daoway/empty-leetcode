package com.blogspot.ostas.leetcode.all.medium.all_paths_from_source_to_target.gpt;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void testExampleGraph() {
        Solution solution = new Solution();
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        List<List<Integer>> result = solution.allPathsSourceTarget(graph);

        assertThat(result)
                .hasSize(2)
                .containsExactlyInAnyOrderElementsOf(
                        List.of(List.of(0, 1, 3), List.of(0, 2, 3))
                );
    }

    @Test
    void testSingleNodeGraph() {
        Solution solution = new Solution();
        int[][] graph = {{}};
        List<List<Integer>> result = solution.allPathsSourceTarget(graph);

        assertThat(result)
                .hasSize(1)
                .containsExactlyInAnyOrderElementsOf(
                        List.of(List.of(0))
                );
    }
}
