package chapter2.item5;

public class APump implements Pump{
	private Heater heater;

	public APump(Heater heater) {
		this.heater = heater;
	}

	public void pump() {
		System.out.println("heater.isHot() " + heater.isHot());
		if (heater.isHot()) {
			System.out.println("A_Pump => pumping ~");
		}
	}
}
