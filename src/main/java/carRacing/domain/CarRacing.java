package carRacing.domain;

import java.util.ArrayList;
import java.util.List;

public class CarRacing {

	private final List<Car> cars;

	public CarRacing(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> createWinners() {
		int bestLocation = this.extractBestLocation();

		List<Car> winners = new ArrayList<>();
		for (Car car : this.cars) {
			this.addWinner(bestLocation, winners, car);
		}

		return winners;
	}

	private void addWinner(int bestLocation, List<Car> winners, Car car) {
		if (car.isBestLocation(bestLocation)) {
			winners.add(car);
		}
	}

	private int extractBestLocation() {
		int bestLocation = 0;
		for (Car car : this.cars) {
			bestLocation = car.greaterLocation(bestLocation);
		}
		return bestLocation;
	}
}
