/*
* Temperature converter from Fahrenheit to Celcius
* Author: Gonzalo Vazquez
*/

// APPLICATION NAMESPACE
App = {};

//Temperature Module
App.Temperature = (function() {
	var converter = function(temperature, isCelcius) {
		if (isCelcius) {
			return ((temperature * 9) / 5 + 32) + '˚F' ;
		} else {
			return ((temperature - 32) * 5 / 9) + '˚C';
		}
	};

	return { 
		converter: converter
	};

}());

//HOW TO USE IT

//Convert to Fahrenheit
App.Temperature.converter(32, true);

//Convert to Celcius
App.Temperature.converter(120);
