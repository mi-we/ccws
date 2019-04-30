package temporaryfield;

import java.util.List;

public class SprintReport {
    private final List<Integer> numberOfClosedStoriesPerSprint;
    private final List<String> winningTeamPerSprint;

    SprintReport(List<Integer> numberOfClosedStoriesPerSprint, List<String> winningTeamPerSprint) {
        this.numberOfClosedStoriesPerSprint = numberOfClosedStoriesPerSprint;
        this.winningTeamPerSprint = winningTeamPerSprint;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < numberOfClosedStoriesPerSprint.size(); i++) {
            message.append("In Sprint ")
                    .append(i + 1)
                    .append(", ")
                    .append(numberOfClosedStoriesPerSprint.get(i))
                    .append(" stories were closed. Team ")
                    .append(winningTeamPerSprint.get(i))
                    .append(" closed most stories.")
                    .append("\n");

        }
        return message.toString();
    }
}
