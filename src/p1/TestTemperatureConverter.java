package p1;

class TestTemperatureConverter {

	public static void main(String[] args) {
		
		TemperatureConverter tempConverter = new TemperatureConverter();
		
		double tempF = tempConverter.convertToFahrenheit(0);
		System.out.println("Temp (F): " + tempF + "F");

		double tempC = tempConverter.convertToCentigrade(0);
		System.out.println("Temp (C): " + tempC + "C");
		
		System.out.println("The aggregate state of water at 13C is: " + tempConverter.getAggregateStateOfWater(13));
	}

}