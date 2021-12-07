package chapter2.item5;

public class Injection {
	public static Heater provideHeater() {
		return new AHeater();
	}

	public static Pump providePump(Heater heater) {
		return new APump(heater);
	}

	public static CoffeeMaker provideCoffeeMaker() {
		Heater heater = provideHeater();
		return new CoffeeMaker(heater, providePump(heater));
	}
}
