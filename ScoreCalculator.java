public class ScoreCalculator {

    public int sumPositive(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            if (number > 0) {
                total += number;
            }
        }

        return total;
    }

    public int sumPositiveLimited(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            if (number > 0) {
                total += number;
            }
        }

        if (total > 100) {
            total = 100;
        }

        return total;
    }
}
