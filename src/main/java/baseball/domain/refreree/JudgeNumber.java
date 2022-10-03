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
        validationNumber(inputNumber);

        this.numbers = numbers;
    }

    private void validationNumber(String inputNumber) {
        GameValidation.validateNumberDuplicate(inputNumber);
        GameValidation.validateNumberRange(inputNumber);
        GameValidation.validateNumberSize(inputNumber);
        GameValidation.validateNumberFormat(inputNumber);
        GameValidation.validateNumberHasZero(inputNumber);
    }

    public boolean isStrike(int position, int number) {
        return this.numbers.get(position) == number;
    }

    public boolean isBall(int position, int number) {
        return this.numbers.contains(number) && !isStrike(position, number);
    }
}
