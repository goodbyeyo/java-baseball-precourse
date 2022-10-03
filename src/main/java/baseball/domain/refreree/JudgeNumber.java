package baseball.domain.refreree;

import baseball.validation.GameValidation;

import java.util.List;

public class JudgeNumber {

    private final List<Integer> numbers;

    public JudgeNumber(List<Integer> numbers) {

        StringBuilder sb = new StringBuilder();
        for (Integer number : numbers) {
            sb.append(number);
        }
        String inputNumber = sb.toString();
        GameValidation.validationNumber(inputNumber);

        this.numbers = numbers;
    }



    public boolean isStrike(int position, int number) {
        return this.numbers.get(position) == number;
    }

    public boolean isBall(int position, int number) {
        return this.numbers.contains(number) && !isStrike(position, number);
    }
}
