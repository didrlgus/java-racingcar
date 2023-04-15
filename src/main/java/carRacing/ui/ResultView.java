package carRacing.ui;

import java.util.ArrayList;
import java.util.List;

import carRacing.domain.Car;

public class ResultView {

	private static final char LOCATION_REPRESENTATION_SYMBOL = '-';
	private static final String NAME_LOCATION_DELIMITER = " : ";
	private static final String WINNER_NAMES_DELIMITER = ", ";
	private static final String WINNER_TEXT_POSTFIX = "가 최종 우승했습니다.";

	public void printStatus(List<Car> cars) {
		for (Car car : cars) {
			this.printName(car);
			this.printLocation(car);
			this.printLineSpace();
		}
		this.printLineSpace();
	}

	public void printWinners(List<Car> winners) {
		List<String> winnerNames = new ArrayList<>();
		for (Car car : winners) {
			winnerNames.add(car.getName().getName());
		}

		System.out.print(String.join(WINNER_NAMES_DELIMITER, winnerNames));
		System.out.println(WINNER_TEXT_POSTFIX);
	}

	private void printName(Car car) {
		System.out.print(car.getName().getName() + NAME_LOCATION_DELIMITER);
	}

	private void printLocation(Car car) {
		for (int i = 0; i < car.getLocation().getLocation(); i++) {
			System.out.print(LOCATION_REPRESENTATION_SYMBOL);
		}
	}

	private void printLineSpace() {
		System.out.println();
	}
}
