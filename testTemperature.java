public class TestTemperature {
	public static void main (String [] args) {
		//Instansiate new Temperature
		Temperature myTemp = new Temperature(78);
		int myTemperatureIs = myTemp.toFarhenheit();
		System.out.println(" My Temperature is " + myTemperatureIs);
	}
}