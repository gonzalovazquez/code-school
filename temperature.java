/*
* Temperature converter from Fahrenheit to Celcius
* Author: Gonzalo Vazquez
*/
public class Temperature {
    private int temp;

	//Constructor
	public Temperature(int val1) {
		setTemp(val1);
	}

	//Overload Constructor
	public Temperature () {}

	//Setter
	public void setTemp(int inTemp) {
		temp = inTemp;
	}

	//Getter
	public int getTemp() {
		return temp;
	}

	//Method to calculate
	public int toFarhenheit() {
		int result = (temp * 9) / 5 + 32;
		return result;
	}

	public int toCelcius() {
		int result = (temp - 32) * 5 / 9;
		return result;
	}
}