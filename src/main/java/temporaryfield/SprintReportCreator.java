package temporaryfield;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class SprintReportCreator {

    private List<String> winningTeamPerSprint;

    SprintReport create() {
        List<Integer> numberOfClosedStoriesPerSprint = getTotalNumberOfClosedStoriesPerSprint();

        return new SprintReport(
                numberOfClosedStoriesPerSprint,
                winningTeamPerSprint
        );
    }

    private List<Integer> getTotalNumberOfClosedStoriesPerSprint() {
        List<Map<String, Integer>> closedStoriesPerTeamPerSprint = getClosedStoriesPerTeam();
        List<Integer> totalNumberOfClosedStoriesPerSprint = new ArrayList<>();
        winningTeamPerSprint = new ArrayList<>();
        for (Map<String, Integer> closedStoriesPerTeam : closedStoriesPerTeamPerSprint) {
            totalNumberOfClosedStoriesPerSprint.add(sumOf(closedStoriesPerTeam.values()));
            winningTeamPerSprint.add(getWinningTeamFrom(closedStoriesPerTeam));
        }
        return totalNumberOfClosedStoriesPerSprint;
    }

    private String getWinningTeamFrom(Map<String, Integer> closedStoriesPerTeam) {
        int winningNumberOfClosedStories = -1;
        String winningTeam = null;
        for (Map.Entry<String, Integer> entry : closedStoriesPerTeam.entrySet()) {
            if (entry.getValue() > winningNumberOfClosedStories) {
                winningNumberOfClosedStories = entry.getValue();
                winningTeam = entry.getKey();
            }
        }
        return winningTeam;
    }

    private Integer sumOf(Collection<Integer> values) {
        return values.stream().mapToInt(Integer::intValue).sum();
    }

    private List<Map<String, Integer>> getClosedStoriesPerTeam() {
        return List.of(
                Map.of("A", 5, "B", 2, "C", 3),
                Map.of("A", 5, "B", 4, "C", 7),
                Map.of("A", 7, "B", 8, "C", 6),
                Map.of("A", 6, "B", 10, "C", 2),
                Map.of("A", 3, "B", 7, "C", 6),
                Map.of("A", 8, "B", 5, "C", 3),
                Map.of("A", 6, "B", 4, "C", 2)
        );
    }

    private void getNumberOfClosedStoriesPerTeam() {

    }
}
