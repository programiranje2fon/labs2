package p1;

class TestTemperatureConverter {

	public static void main(String[] args) {
		
		TemperatureConverter tc = new TemperatureConverter();
		
		double tF = tc.convertCtoF(0);
		
		System.out.println("Temp (F): " + tF + "F");

		double tC = tc.convertFtoC(0);
		
		System.out.println("Temp (C): " + tC + "C");
		
		System.out.println("The aggregate state of water at 13C is: " + tc.getAggregateStateOfWater(13));
	}

}