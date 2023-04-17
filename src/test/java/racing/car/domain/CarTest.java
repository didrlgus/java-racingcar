package racing.car.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	@DisplayName("전진한다.")
	@Test
	void test1() {
		Car car = new Car("pobi", 0);
		car.move(() -> 4);

		assertThat(car).isEqualTo(new Car("pobi", 1));
	}

	@DisplayName("멈춘다.")
	@Test
	void test2() {
		Car car = new Car("pobi", 0);
		car.move(() -> 3);

		assertThat(car).isEqualTo(new Car("pobi", 0));
	}
}