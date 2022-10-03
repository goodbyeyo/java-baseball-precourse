package baseball.domain.computer;

import baseball.domain.constants.GameNumber;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private static Computer instance;
    public String number;

    public String getNumber() {
        return number;
    }

    public static Computer getInstance() {
        if (instance == null) {
            instance = new Computer();
        }
        return instance;
    }

    private Computer() {
        number = generateNumber();
    }

    public void reset() {
        instance.number = generateNumber();
    }

    private String generateNumber() {
        List<Integer> pickedNumbers = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        while (pickedNumbers.size() < 3) {
            int randomNumber = pickUniqueSingleNumber(pickedNumbers);
            pickedNumbers.add(randomNumber);
        }

        for (Integer number : pickedNumbers) {
            result.append(number);
        }

        return result.toString();

    }

    private int pickUniqueSingleNumber(List<Integer> pickedNumbers) {

        int pickNumber = Randoms.pickNumberInRange(
                GameNumber.MIN_NUMBER.getNumber(),
                GameNumber.MAX_NUMBER.getNumber());

        if (pickedNumbers.contains(pickNumber)) {
            return pickUniqueSingleNumber(pickedNumbers);
        }

        return pickNumber;
    }

}
