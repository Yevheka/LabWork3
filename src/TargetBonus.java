public class TargetBonus extends BonusDecorator {
    public TargetBonus(Score baseScore) {
        super(baseScore);
    }

    @Override
    public int calculate() {
        return super.calculate() + 10;
    }
}
