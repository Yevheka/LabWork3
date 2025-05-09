public class ApplicantScore implements Score {
    private int math;
    private int ukrainian;
    private int history;

    public ApplicantScore(int math, int ukrainian, int history) {
        this.math = math;
        this.ukrainian = ukrainian;
        this.history = history;
    }

    @Override
    public int calculate() {
        return math + ukrainian + history;
    }
}
