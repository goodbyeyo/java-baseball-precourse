package baseball.domain.refreree;

import baseball.constants.GameNumber;
import baseball.domain.user.UserNumber;
import baseball.view.ResultView;

public class Referee {

    private final String resultMessage;
    private final Boolean isGameEnd;

    public Referee(UserNumber userNumber, JudgeNumber judgeNumber) {
        int strikes = countStrikes(userNumber, judgeNumber);
        int balls = countBalls(userNumber, judgeNumber);
        this.resultMessage = ResultView.getResultViewMessage(strikes, balls);
        this.isGameEnd = strikes == GameNumber.NUMBER_LENGTH.getNumber();
    }

    public String getResultMessage() {
        return this.resultMessage;
    }

    private int countStrikes(UserNumber userNumber, JudgeNumber judgeNumber) {
        int strikes = 0;
        int number;

        for (int i = 0; i < GameNumber.NUMBER_LENGTH.getNumber(); i++) {
            number = userNumber.getNumberInPosition(i);
            if (judgeNumber.isStrike(i, number)) {
                strikes++;
            }
        }
        return strikes;
    }

    private int countBalls(UserNumber userNumber, JudgeNumber judgeNumber) {
        int balls = 0;
        int number;

        for (int i = 0; i < GameNumber.NUMBER_LENGTH.getNumber(); i++) {
            number = userNumber.getNumberInPosition(i);
            if (judgeNumber.isBall(i, number)) {
                balls++;
            }
        }
        return balls;
    }

    public boolean isGameEnd() {
        return this.isGameEnd;
    }
}
