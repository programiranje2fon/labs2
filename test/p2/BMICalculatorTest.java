package p2;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BMICalculatorTest {

    BMICalculator instance;

	@Before
	public void setUp() throws Exception {
		instance = new BMICalculator();
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
	}

	@Test
	public void field_BMIvalue() {
		assertEquals("Initial value is not 0.0", 0.0, instance.bmiValue, 0.001);
	}

	@Test
	public void method_calculateBMI_Test() {
		instance.calculateBMI(1.95, 100);

		assertEquals("If you enter 1.95m and 100kg, the method does not set the field BMIvalue to 26.29848", 26.29848,
				instance.bmiValue, 0.001);
	}

	@Test
	public void metoda_izracunajBMI_Test2() {
		PrintStream aux = System.out;
		try {
			// Open outputstream to redirect System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirect
			System.setOut(new PrintStream(buffer));

			instance.calculateBMI(1.19, 100);

			assertEquals(
					"If you enter 1.19m and 100kg, the method sets the value of BMIvalue but it shouldn't, since the height is out of bounds",
					0.0, instance.bmiValue, 0.001);

			System.out.flush();

			// get method's console output
			String output = buffer.toString();

			// Revert System.out to its original value
			System.setOut(aux);

			assertTrue("In case of error, the word ERROR is NOT printed.", output.trim().equalsIgnoreCase("ERROR"));
		} catch (Exception e) {
			System.setOut(aux);
			e.printStackTrace();
		}
	}

	@Test
	public void method_calculateBMI_Test3() {
		PrintStream aux = System.out;
		try {
			// Open outputstream to redirect System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirect
			System.setOut(new PrintStream(buffer));

			instance.calculateBMI(2.41, 100);

			assertEquals(
					"If you enter 2.41m and 100kg, the method sets the value of BMIvalue but it shouldn't, since the height is out of bounds",
					0.0, instance.bmiValue, 0.001);

			System.out.flush();

			// get method's console output
			String output = buffer.toString();

			// Revert System.out to its original value
			System.setOut(aux);

			assertTrue("In case of error, the word ERROR is NOT printed.", output.trim().equalsIgnoreCase("ERROR"));
		} catch (Exception e) {
			System.setOut(aux);
			e.printStackTrace();
		}
	}

	@Test
	public void method_calculateBMI_Test4() {
		PrintStream aux = System.out;
		try {
			// Open outputstream to redirect System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirect
			System.setOut(new PrintStream(buffer));

			instance.calculateBMI(1.95, 29.5);

			assertEquals(
                    "If you enter 1.95m and 29.5kg, the method sets the value of BMIvalue but it shouldn't, since the height is out of bounds",
					0.0, instance.bmiValue, 0.001);

			System.out.flush();

			// get method's console output
			String output = buffer.toString();

			// Revert System.out to its original value
			System.setOut(aux);

			assertTrue("In case of error, the word ERROR is NOT printed.", output.trim().equalsIgnoreCase("ERROR"));
		} catch (Exception e) {
			System.setOut(aux);
			e.printStackTrace();
		}
	}

	@Test
	public void metoda_izracunajBMI_Test5() {
		PrintStream pom = System.out;
		try {
			// Open outputstream to redirect System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirect
			System.setOut(new PrintStream(buffer));

			instance.calculateBMI(1.95, 200.5);

			assertEquals(
					"If you enter 1.95m and 200.5kg, the method sets the value of BMIvalue but it shouldn't, since the height is out of bounds",
					0.0, instance.bmiValue, 0.001);

			System.out.flush();

			// get method's console output
			String output = buffer.toString();

			// Revert System.out to its original value
			System.setOut(pom);

			assertTrue("In case of error, the word ERROR is NOT printed.", output.trim().equalsIgnoreCase("ERROR"));
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}
	}

	@Test
	public void method_setBMIstatus_ANOREXIC() {
		instance.bmiValue = 14.5;
		
		instance.setBMIStatus();
		
		assertEquals("If BMIvalue is 14.5, the status is not ANOREXIC", BMICategory.ANOREXIC, instance.bmiStatus);
	}
	
	@Test
	public void method_setBMIstatus_SKINNY() {
		instance.bmiValue = 15.5;
		
		instance.setBMIStatus();
		
		assertEquals("If BMIvalue is 15.5, the status is not SKINNY", BMICategory.SKINNY, instance.bmiStatus);
	}

	@Test
	public void method_setBMIstatus_NORMAL() {
		instance.bmiValue = 18.6;
		
		instance.setBMIStatus();
		
		assertEquals("If BMIvalue is 18.6, the status is not NORMAL", BMICategory.NORMAL, instance.bmiStatus);
	}
	
	@Test
	public void method_setBMIstatus_FAT() {
		instance.bmiValue = 25.1;
		
		instance.setBMIStatus();
		
		assertEquals("If BMIvalue is 25.1, the status is not FAT", BMICategory.FAT, instance.bmiStatus);
	}
	
	@Test
	public void method_setBMIstatus_OBESE() {
		instance.bmiValue = 30.1;
		
		instance.setBMIStatus();
		
		assertEquals("If BMIvalue is 30.1, the status is not OBESE", BMICategory.OBESE, instance.bmiStatus);
	}
}
