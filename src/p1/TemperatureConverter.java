package p1;

class TemperatureConverter {

	static final double ABSOLUTE_ZERO_C = -273.15;

	static final double ABSOLUTE_ZERO_F = -459.67;

	double convertCtoF(double tc) {
		if (tc >= ABSOLUTE_ZERO_C)
			return tc * 9 / 5 + 32;
		else {
			System.out.println("Error");
			return -1000;
		}
	}

	double convertFtoC(double tf) {
		if (tf >= ABSOLUTE_ZERO_F)
			return (tf - 32) * 5 / 9;

		// No ELSE needed, since the method can exit due to the previous return.
		System.out.println("Error");
		return -1000;
	}

	AggregateStates getAggregateStateOfWater(double tc) {
		if (tc < 0)
			return AggregateStates.SOLID;
		if (tc < 100)
			return AggregateStates.LIQUID;
		
		return AggregateStates.GAS;
	}

}