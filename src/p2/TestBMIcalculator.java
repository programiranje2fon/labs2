package p2;

class TestBMIcalculator {

	public static void main(String[] args) {
		
		BMICalculator bc = new BMICalculator();
		
		bc.calculateBMI(1.87, 100);
		
		bc.setBMIStatus();
		
		bc.print();

	}

}