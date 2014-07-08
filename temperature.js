/*
* Temperature converter from Fahrenheit to Celcius
* Author: Gonzalo Vazquez
*/

// APPLICATION NAMESPACE
App = {};

//Temperature Module
App.Temperature = (function() {
	var toFarhenheit = function(temp) {
		return ((temp * 9) / 5 + 32) + '˚F' ;
	};

	var toCelcius = function(temp) {
		return ((temp - 32) * 5 / 9) + '˚C';
	};

	return { 
		toFarhenheit: toFarhenheit,
		toCelcius: toCelcius
	};

}());

//HOW TO USE IT

//Convert to Fahrenheit
App.Temperature.toFarhenheit(25);

//Convert to Celcius
App.Temperature.toCelcius(100);