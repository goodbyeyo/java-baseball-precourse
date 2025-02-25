package baseball.domain.user;

import baseball.validation.GameValidation;

import java.util.List;

public class UserNumber {

    final private List<Integer> numbers;

    public UserNumber(List<Integer> numbers) {

        StringBuilder number = new StringBuilder();
        for (Integer integer : numbers) {
            number.append(integer);
        }
        String inputNumber = number.toString();

        GameValidation.validationNumber(inputNumber);

        this.numbers = numbers;
    }

    public int getNumberInPosition(int i) {
        return this.numbers.get(i);
    }

}
