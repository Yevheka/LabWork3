public class Main {
    public static void main(String[] args) {
        Score baseScore = new ApplicantScore(150, 160, 170);

        Score withOlympiad = new OlympiadBonus(baseScore);

        Score finalScore = new TargetBonus(withOlympiad);

        System.out.println("Загальна кількість балів з усіма бонусами: " + finalScore.calculate());
    }
}
