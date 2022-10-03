package baseball.domain.user;

import baseball.domain.constants.SystemMessage;
import baseball.validation.GameValidation;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class User {

    public static List<Integer> getNumberList() throws IllegalArgumentException {
        String inputNumber = getUserInput();
        GameValidation.validateNumberFormat(inputNumber);
        List<Integer> userNumbers = new ArrayList<>();

        for (String s : inputNumber.split("")) {
            Integer parseInt = Integer.parseInt(s);
            userNumbers.add(parseInt);
        }
        return userNumbers;

    }

    private static String getUserInput() {
        System.out.print(SystemMessage.INPUT_WAITING.getMessage());
        return Console.readLine();
    }
}
