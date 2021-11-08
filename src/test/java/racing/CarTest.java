package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author han
 */
class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @ParameterizedTest(name = "전진")
    @CsvSource(value = {"5,1", "6,1", "7,1", "8,1", "9,1"})
    void forward(int input, int expected) {
        assertThat(car.getInstanceByForward(input).getStep()).isEqualTo(expected);
    }

    @ParameterizedTest(name = "멈춤")
    @CsvSource(value = {"1,0", "2,0", "3,0", "4,0"})
    void stop(int input, int expected) {
        assertThat(car.getInstanceByForward(input).getStep()).isEqualTo(expected);
    }

    @ParameterizedTest(name = "Random value 를 통한 전진 테스트")
    @MethodSource("racing.NumberHelperTest#randomIntegerListProvider")
    void forwardsWithRandom(int random) {
        boolean isForward = random > 4;
        assertThat(car.getInstanceByForward(random).getStep() == 1).isEqualTo(isForward);
    }
}