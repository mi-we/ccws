package temporaryfield;

public class Main {
    public static void main(String[] args) {
        SprintReportCreator sprintReportCreator = new SprintReportCreator();
        SprintReport sprintReport = sprintReportCreator.create();
        System.out.println(sprintReport);
    }
}
