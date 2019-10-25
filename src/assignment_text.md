# Lab exercise 2

## Problem 1
(to be done by the tutor in cooperation with students)

Create the **AggregateStates** Enum in package **p1**, with the following values:

1. **SOLID**
2. **LIQUID**
3. **GAS**

Create the **TemperatureConverter** class in package **p1** with:

1. Static constant **ABSOLUTE_ZERO_C** with the value -273.15 

2. Static constant **ABSOLUTE_ZERO_F** with the value -459.67

3. The method called **convertToFahrenheit** that takes the temperature in degrees Centigrade (a real number) as its parameter. The method checks if the temperature passed as the parameter is greater than or equal to the absolute zero expressed in degrees Centigrade and, if it is, converts it into temperature expressed in degrees Fahrenheit and returns the result. Otherwise, the method returns -1000 and prints "Error" in the console. The conversion formula is **TF = TC*9/5 + 32** 

4. The method called **convertToCentigrade** that takes the temperature in degrees Fahrenheit (a real number) as its parameter. The method checks if the temperature passed as the parameter is greater than or equal to the absolute zero expressed in degrees Fahrenheit and, if it is, converts it into temperature expressed in degrees Centigrade and returns the result. Otherwise, the method returns -1000 and prints "Error" in the console. The conversion formula is **TC = (TF-32)*5/9**

5. The method called **getAggregateStateOfWater** that takes the temperature in degrees Centigrade (a real number) as its parameterand checks if the aggregate state of water at that temperature (Enum). If the temperature is less that 0 degrees Centigrade, the method returns that the water is in the solid state (AggregateStates.SOLID). If the temperature is between 0 do 100 degrees (but still less that 100), the method returns that the water is in the liquid state (AggregateStates.LIQUID), and if the temperature is 100 degrees or higher the method returns that the water is in the gas state (AggregateStates.GAS).

Create class **TestTemperatureConverter** in package **p1**. The class should include the **main** method that examines all the methods of the TemperatureConverter class and prints the results in the console.

## Problem 2
(students work on it themselves)

Create the **BMICategory** Enum in package **p2** with the following values:

1. **ANOREXIC**
2. **SKINNY**
3. **NORMAL**
4. **FAT**
5. **OBESE**

Create the **BMICalculator** class in package **p2** with:

1. The **bmiValue** field that represents a person's BMI (Body Mass Index) (e.g., 23.55). The initial value of bmiValue is 0.0.

2. The **bmiStatus** field that represents a person's BMI category (the BMICategory Enum)

3. The **calculateBMI** method that takes 2 parameters: a person's height in **METERS** (a real number, e.g. 1.85) and body weight in kilograms (a real number). Before the actual calculation, it is necessary to check if the height and weight fall in the standard boundaries/intervals (1.20-2.40m and 30-200kg). If they don't, the method just prints "Error" in the console. Otherwise, the method uses the parameters passed and calculates the BMI using the formula **BMI = weight/(height X height)**. The result is used to set the value of the **bmiValue** field.

	Example: 	Height = 1.87 m, Weight = 100 kg,  BMI = 100/(1.87*1.87) = 28.59

4. The **setBMIStatus** method that takes the value of the **bmiValue** field (e.g., 20,02) and sets the BMI category in the **bmiStatus** field as per the following table:

	BMI category	BMI value
	Anorexic		BMI <= 15 
	Skinny 			15 < BMI <= 18.5 
	Normal 			18.5 < BMI <= 25
	Fat				25 < BMI <= 30
	Obese			30 < BMI

5. The **print** method that prints in the console the values of the bmiValue and bmiStatus fields, with an appropriate message.

Create the **TestBMIcalculator** class in package **p2**. The class should include the **main** method that examines the BMICalculator.