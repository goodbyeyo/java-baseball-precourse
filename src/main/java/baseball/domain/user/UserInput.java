package baseball.domain.user;

import baseball.constants.SystemMessage;
import baseball.validation.GameValidation;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class UserInput {

    public static List<Integer> getNumberList(String message) throws IllegalArgumentException {
        String inputNumber = getUserInput(message);
        GameValidation.validateNumberFormat(inputNumber);
        List<Integer> userNumbers = new ArrayList<>();

        for (String s : inputNumber.split("")) {
            Integer parseInt = Integer.parseInt(s);
            userNumbers.add(parseInt);
        }
        return userNumbers;

    }

    private static String getUserInput(String message) {
        System.out.print(message);
        return Console.readLine();
    }

    public static int getEndNumber(String message) throws IllegalArgumentException {
        String input = getUserInput(message);
        return Integer.parseInt(input);
    }

}
