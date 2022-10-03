package baseball.constants;

public enum ErrorMessage {

    NOT_NUMBER_FORMAT("숫자만 입력 가능합니다"),
    OUT_OF_NUMBER_RANGE("1부터 9까지 숫자만 입력 가능합니다"),
    OUT_OF_NUMBER_SIZE("3자리 숫자만 입력 가능합니다"),
    NON_DUPLICATE("중복된 숫자는 입력 불가능합니다"),
    NON_ZERO_NUMBER("숫자 0은 입력 불가능합니다"),
    GAME_END_INPUT_ERR("숫자 1 또는 2만 입력 가능합니다");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
