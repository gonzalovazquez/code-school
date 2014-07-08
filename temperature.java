/*
* Temperature converter from Fahrenheit to Celcius
* Author: Gonzalo Vazquez
*/
public class Temperature() {
	private int temp;

	//Constructor
	public Temperature(int val1) {
		setTemp(val1);
	}

	//Overload Constructor
	public Constructor () {}

	//Setter
	public void setTemp(int inTemp) {
		temp = int(inTemp);
	}

	//Getter
	public int getTemp() {
		return temp;
	}

	//Method to calculate
	public int calculate() {
		//Converts C -> F 
		int result = (temp * 9) / 5 + 32;
		return result;
	}
}