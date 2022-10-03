package baseball.validation;

import baseball.constants.GameNumber;

import java.util.*;

import static baseball.constants.ErrorMessage.*;

public class GameValidation {

    public static void validateNumberDuplicate(String inputNumber) throws IllegalArgumentException {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : inputNumber.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        if( map.keySet().size() != GameNumber.NUMBER_LENGTH.getNumber()) {
            throw new IllegalArgumentException(NON_DUPLICATE.getMessage());
        }
    }

    public static void validateNumberFormat(String inputNumber) throws IllegalArgumentException {
        try {
            Integer.valueOf(inputNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NOT_NUMBER_FORMAT.getMessage());
        }
    }

    public static void validateNumberSize(String inputNumbers) throws IllegalArgumentException {
        if (inputNumbers.length() != GameNumber.NUMBER_LENGTH.getNumber()) {
            throw new IllegalArgumentException(OUT_OF_NUMBER_SIZE.getMessage());
        }
    }

    public static void validateNumberRange(String inputNumber) throws IllegalArgumentException {
        int number = Integer.parseInt(inputNumber);

        if (number < 100 || number > 999){
            throw new IllegalArgumentException(OUT_OF_NUMBER_SIZE.getMessage());
        }
    }

    public static void validateNumberHasZero(String inputNumber) throws IllegalArgumentException {
        if (inputNumber.indexOf('0') != -1) {
            throw new IllegalArgumentException(NON_ZERO_NUMBER.getMessage());
        }
    }

}
