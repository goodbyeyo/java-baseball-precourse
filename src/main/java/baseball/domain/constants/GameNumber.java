package baseball.domain.constants;

public enum GameNumber {
    MIN_NUMBER(1),
    MAX_NUMBER(9);

    private final int number;

    GameNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

}
