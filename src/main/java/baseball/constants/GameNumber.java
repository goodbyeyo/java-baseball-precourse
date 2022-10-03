package baseball.constants;

public enum GameNumber {
    MIN_NUMBER(1),
    MAX_NUMBER(9),
    NUMBER_LENGTH(3),
    GAME_END(2),
    GAME_RESTART(1);

    private final int number;

    GameNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

}
