package baseball.domain.computer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerTest {

    @Test
    @DisplayName("컴퓨터가 먼저 생성한 난수와 리셋 후 생성한 난수 동일하지 않아야 한다")
    void computerTest() {
        Computer computer = Computer.getInstance();

        String previousGameNumber = computer.getNumber();
        System.out.println("previousNumber = " + previousGameNumber);

        computer.reset();

        String currentGameNumber = computer.getNumber();
        System.out.println("currentNumber = " + currentGameNumber);

        assertThat(currentGameNumber).isNotEqualTo(previousGameNumber);
    }
}