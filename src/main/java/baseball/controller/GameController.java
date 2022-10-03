package baseball.controller;

import baseball.constants.GameNumber;
import baseball.constants.SystemMessage;
import baseball.domain.computer.Computer;
import baseball.domain.user.UserInput;
import baseball.service.GameService;
import baseball.validation.GameValidation;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    public static void gameStart() {
        boolean isRunning = true;

        while (isRunning) {
            new GameService().play();
            isRunning = isRestart();
        }
    }

    private static boolean isRestart() {
        int input = UserInput.getEndNumber(SystemMessage.GAME_RESTART.getMessage());
        GameValidation.validateNumberRestart(input);
        return input == GameNumber.GAME_RESTART.getNumber();
    }

}
