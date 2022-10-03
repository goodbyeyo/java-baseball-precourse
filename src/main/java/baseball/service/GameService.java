package baseball.service;

import baseball.constants.SystemMessage;
import baseball.domain.computer.Computer;
import baseball.domain.refreree.JudgeNumber;
import baseball.domain.refreree.Referee;
import baseball.domain.user.UserInput;
import baseball.domain.user.UserNumber;

import java.util.ArrayList;
import java.util.List;

public class GameService {

    private final JudgeNumber judgeNumber;
    private boolean isRunning;

    public GameService() {
        Computer computer = Computer.getInstance();
        String number = computer.getNumber();
        String[] strArray = number.split("");

        List<Integer> numberList = new ArrayList<>();
        for(String str : strArray) {
            numberList.add(Integer.valueOf(str));
        }

        this.judgeNumber = new JudgeNumber(numberList);
        this.isRunning = true;
    }

    public void play() {
        while (isRunning) {
            gameplaying();
        }
        System.out.println(SystemMessage.GAME_OVER.getMessage());
    }

    private void gameplaying() {
        Referee referee = new Referee(getUserNumber(), judgeNumber);
        System.out.println(referee.getResultMessage());
        checkGameEnded(referee);
    }

    private UserNumber getUserNumber() {
        return new UserNumber(UserInput.getNumberList(SystemMessage.INPUT_WAITING.getMessage()));
    }

    private void checkGameEnded(Referee referee) {
        if (referee.isGameEnd()) {
            this.isRunning = false;
        }
    }
}
