package scienceportal;

public interface ScienceEssayReviewer {
    void notifyAbout(Submission submission);

    SubmissionIds getSubmissionsToReview();

    void reviewFor(ScienceEssayPublisher publisher);

    String getName();

    void reviewNextSubmission();
}
