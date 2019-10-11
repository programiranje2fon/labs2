package p2;

class BMICalculator {

	double bmiValue = 0.0;

	BMICategory bmiStatus;

	void calculateBMI(double h, double w) {
		if (h >= 1.2 && h <= 2.4 && w >= 30 && w <= 200)
			bmiValue = w / (h * h);
		else
			System.out.println("ERROR");
	}

	void setBMIStatus() {
		if (bmiValue <= 15)
		    bmiStatus = BMICategory.ANOREXIC;
		else if (bmiValue <= 18.5)
		    bmiStatus = BMICategory.SKINNY;
		else if (bmiValue <= 25)
		    bmiStatus = BMICategory.NORMAL;
		else if (bmiValue <= 30)
		    bmiStatus = BMICategory.FAT;
		else
		    bmiStatus = BMICategory.OBESE;
	}
	
	void print() {
		System.out.println("BMI value: " + bmiValue);
		System.out.println("BMI status: " + bmiStatus);
	}

}