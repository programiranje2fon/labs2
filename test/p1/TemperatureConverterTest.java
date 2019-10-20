package p1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TemperatureConverterTest {

	TemperatureConverter instance;
	
	@Before
	public void setUp() throws Exception {
		instance = new TemperatureConverter();
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
	}

	@Test
	public void constant_absoluteZeroC() {
		assertEquals("The constant value is not -273.15",-273.15,TemperatureConverter.ABSOLUTE_ZERO_C, 0.001);
	}
	
	@Test
	public void constant_absoluteZeroF() {
		assertEquals("The constant value is not -459.67",-459.67,TemperatureConverter.ABSOLUTE_ZERO_F, 0.001);
	}
	
	@Test
	public void method_convertCtoFTest1() {
		assertEquals("If you enter 0 C, the value returned is not 32",32,instance.convertCtoF(0), 0.001);
	}
	
	@Test
	public void method_convertCtoFTest2() {
		assertEquals("If you enter 5 C, the value returned is not 41",41,instance.convertCtoF(5), 0.001);
	}
	
	@Test
	public void method_convertCtoFTestError() {
			PrintStream aux = System.out;
		try {
			//Open outputstream to redirect System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			//Redirect
			System.setOut(new PrintStream(buffer));
			
			assertEquals("If you enter -274 C, the value returned is not -1000",-1000,instance.convertCtoF(-274), 0.001);
			
			System.out.flush();
			
			//get method's console output
			String output = buffer.toString();
			
			//Revert System.out to its original value
			System.setOut(aux);
			
			assertTrue("In case of error, the word ERROR is NOT printed.", output.trim().equalsIgnoreCase("ERROR"));
		} catch (Exception e) {
			System.setOut(aux);
			e.printStackTrace();
		}
	}
	
	@Test
	public void method_convertFtoCTest1() {
		assertEquals("If you enter 41 F, the value returned is not 5",5,instance.convertFtoC(41), 0.001);
	}
	
	@Test
	public void method_convertFtoCTest2() {
		assertEquals("If you enter 32 F, the value returned is not 0",0,instance.convertFtoC(32), 0.001);
	}
	
	@Test
	public void method_convertFtoCTestError() {
		PrintStream aux = System.out;
		try {
			//Open outputstream to redirect System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			//Redirect
			System.setOut(new PrintStream(buffer));
			
			assertEquals("If you enter -460 F, the value returned is not -1000",-1000,instance.convertFtoC(-460), 0.001);
			
			System.out.flush();
			
			//get method's console output
			String ispis = buffer.toString();
			
			//Revert System.out to its original value
			System.setOut(aux);
			
			assertTrue("In case of error, the word ERROR is NOT printed", ispis.trim().equalsIgnoreCase("ERROR"));
		} catch (Exception e) {
			System.setOut(aux);
			e.printStackTrace();
		}
	}
	
	@Test
	public void method_getAggregateStateOfWaterSOLID() {
		assertEquals("If you enter -0.5 C, the value returned is not SOLID",AggregateStates.SOLID,instance.getAggregateStateOfWater(-0.5));
	}
	
	@Test
	public void method_getAggregateStateOfWaterLIQUID() {
		assertEquals("If you enter -0.5 C, the value returned is not LIQUID",AggregateStates.LIQUID,instance.getAggregateStateOfWater(0));
	}
	
	@Test
	public void method_getAggregateStateOfWaterGAS() {
		assertEquals("If you enter 100 C, the value returned is not GAS",AggregateStates.GAS,instance.getAggregateStateOfWater(100));
	}

}
