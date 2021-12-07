package chapter2.item5;

public class AHeater implements Heater{
	boolean heating;

	public void on() {
		System.out.println("A_Heater! heating... .. . ");
		this.heating = true;
		System.out.println("A_Heater! heating... .. . " +this.heating);
	}

	public void off() {
		this.heating = false;
	}

	public boolean isHot() {
		return heating;
	}

}
