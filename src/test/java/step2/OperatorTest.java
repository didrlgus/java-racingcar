package step2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

@DisplayName("연산자 Enum 테스트")
class OperatorTest {

    @DisplayName("특정 연산 기호에 맞는 연산자를 찾는다")
    @ParameterizedTest
    @MethodSource("operatorProvider")
    void of(String sign, Operator operator) {
        final Operator actual = Operator.of(sign);

        assertThat(actual).isEqualTo(operator);
    }

    static Stream<Arguments> operatorProvider() {
        return Stream.of(
                Arguments.of("+", Operator.ADDITION),
                Arguments.of("-", Operator.SUBTRACTION),
                Arguments.of("*", Operator.MULTIPLICATION),
                Arguments.of("/", Operator.DIVISION)
        );
    }

    @DisplayName("사칙연산 기호가 아닌 경우 예외가 발생한다")
    @Test
    void of_2() {
        final String given = "%";

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> Operator.of(given));
    }

    @ParameterizedTest
    @MethodSource(value = "operatorProvider")
    void of3(String sign) {
        final Operator operator = Operator.of(sign);
    }

}