public class OlympiadBonus extends BonusDecorator {
    public OlympiadBonus(Score baseScore) {
        super(baseScore);
    }

    @Override
    public int calculate() {
        return super.calculate() + 20;
    }
}
