package p1;

import static org.junit.Assert.*;



import org.junit.Test;

public class AggregateStatesTest {

	@Test
	public void enum_SOLID() {
		assertEquals(AggregateStates.SOLID, AggregateStates.SOLID);
	}
	
	@Test
	public void enum_LIQUID() {
		assertEquals(AggregateStates.LIQUID, AggregateStates.LIQUID);
	}
	
	@Test
	public void enum_GAS() {
		assertEquals(AggregateStates.GAS, AggregateStates.GAS);
	}

}
