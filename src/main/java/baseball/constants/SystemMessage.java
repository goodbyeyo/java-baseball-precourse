package baseball.constants;

public enum SystemMessage {
    INPUT_WAITING("숫자를 입력해주세요 : "),
    JUDGE_STRIKE("스트라이크"),
    JUDGE_BALL("볼"),
    JUDGE_NOTHING("낫싱"),
    GAME_OVER("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    GAME_RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");

    private final String message;

    SystemMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
