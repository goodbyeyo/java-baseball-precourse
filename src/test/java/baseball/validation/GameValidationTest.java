package baseball.validation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameValidationTest {

    @Test
    @DisplayName("유저는 숫자만 입력 할 수 있다")
    void UserInputFormatTest() {
        String userInput = "AB1";
        assertThrows(
                IllegalArgumentException.class,
                () -> GameValidation.validateNumberFormat(userInput)
        );

    }

    @Test
    @DisplayName("유저는 중복된 숫자를 입력 할 수 없다")
    void UserInputDuplicate() {
        String userInput = "966";
        assertThrows(
                IllegalArgumentException.class,
                () -> GameValidation.validateNumberDuplicate(userInput)
        );
    }

    @Test
    @DisplayName("유저는 3자리의 숫자만 입력 할 수 있다")
    void UserInputSizeTest() {
        String userInput = "9664";
        assertThrows(
                IllegalArgumentException.class,
                () -> GameValidation.validateNumberSize(userInput)
        );
    }

    @Test
    @DisplayName("유저는 1부터 9까지의 숫자만 입력 할 수 있다")
    void UserInputRangeTest() {
        List<Integer> inputList = Arrays.asList(1, 7, 12);
        StringBuilder userInput = new StringBuilder();

        for (Integer integer : inputList) {
            userInput.append(integer.toString());
        }
        System.out.println("userInput = " + userInput.toString());

        assertThrows(
                IllegalArgumentException.class,
                () -> GameValidation.validateNumberRange(userInput.toString())
        );
    }

    @Test
    @DisplayName("유저는 숫자 0을 입력 할 수 없다")
    void UserInputZeroTest() {
        String userInput = "108";
        assertThrows(
                IllegalArgumentException.class,
                () -> GameValidation.validateNumberHasZero(userInput)
        );
    }
}