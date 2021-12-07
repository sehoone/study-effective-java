package chapter2.item5;

public class Item5Main {
	public static void main(String[] args) {
		Heater heater = new AHeater();
		Pump pump = new APump(heater);
		CoffeeMaker coffeeMaker = new CoffeeMaker(heater, pump);
		coffeeMaker.brew();
	}
}
