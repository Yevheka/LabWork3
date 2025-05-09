public abstract class BonusDecorator implements Score {
    protected Score baseScore;

    public BonusDecorator(Score baseScore) {
        this.baseScore = baseScore;
    }

    @Override
    public int calculate() {
        return baseScore.calculate();
    }
}
