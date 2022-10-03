package baseball.constants;

public enum SystemMessage {
    INPUT_WAITING("숫자를 입력해주세요 : "),
    JUDGE_STRIKE("스트라이크"),
    JUDGE_BALL("볼"),
    JUDGE_NOTHING("낫싱");

    private final String message;

    SystemMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
