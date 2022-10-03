package baseball.view;

import baseball.constants.SystemMessage;

import static baseball.constants.SystemMessage.*;

public class ResultView {

    // TODO 스트라이크, 볼, 낫싱 일 경우 각각 message 리턴 구현
    public static String getResultViewMessage(int strikes, int balls) {
        StringBuilder message = new StringBuilder();
        if (strikes == 0 && balls == 0) {
            return JUDGE_NOTHING.getMessage();
        }

        if (balls != 0) {
            message.append(balls).append(JUDGE_BALL.getMessage());
        }

        if (strikes != 0 && balls != 0) {
            message.append(" ");
        }

        if (strikes != 0) {
            message.append(strikes).append(JUDGE_STRIKE.getMessage());
        }

        return message.toString();
    }
}
