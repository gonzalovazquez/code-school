public class TestTemperature {
	public static void main (Strings [] args) {
		//Instansiate new Temperature
		Temperature myTemp = new Temperature(45);
		int myTemperatureIs = myTemp.calculate();
		System.out.println(" My Temperature is Fahrenheit is " + myTemperatureIs);
	}
}