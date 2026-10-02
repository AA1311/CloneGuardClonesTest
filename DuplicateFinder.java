import java.util.HashSet;
import java.util.Set;

public class DuplicateFinder {

    public boolean hasDuplicateWithSet(int[] numbers) {
        Set<Integer> seen = new HashSet<>();

        for (int number : numbers) {
            if (!seen.add(number)) {
                return true;
            }
        }

        return false;
    }

    public boolean hasDuplicateWithLoops(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
