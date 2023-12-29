package com.blogspot.ostas.leetcode.all.medium.all_paths_from_source_to_target.gpt;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

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

  @Test
  @Disabled("No such test in LC")
  void testDisconnectedGraph() {
    Solution solution = new Solution();
    int[][] graph = {{1, 2}, {}, {3}, {}};
    List<List<Integer>> result = solution.allPathsSourceTarget(graph);

    assertThat(result)
        .isEmpty(); // No paths in a disconnected graph
  }

  @Test
  @Disabled("Graph is acyclic... skipping")
  void testGraphWithLoops() {
    Solution solution = new Solution();
    int[][] graph = {{1, 2}, {3}, {3, 4}, {4, 5}, {2}, {}};
    List<List<Integer>> result = solution.allPathsSourceTarget(graph);

    assertThat(result)
        .hasSize(4)
        .containsExactlyInAnyOrderElementsOf(
            List.of(
                List.of(0, 1, 3, 4),
                List.of(0, 2, 3, 4),
                List.of(0, 1, 4),
                List.of(0, 2, 4)
            )
        );
  }
}
