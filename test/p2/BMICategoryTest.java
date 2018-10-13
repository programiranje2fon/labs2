package p2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BMICategoryTest {

	@Test
	public void enum_ANOREXIC() {
		assertEquals(BMICategory.ANOREXIC, BMICategory.ANOREXIC);
	}
	
	@Test
	public void enum_SKINNY() {
		assertEquals(BMICategory.SKINNY, BMICategory.SKINNY);
	}
	
	@Test
	public void enum_NORMAL() {
		assertEquals(BMICategory.NORMAL, BMICategory.NORMAL);
	}
	
	@Test
	public void enum_FAT() {
		assertEquals(BMICategory.FAT, BMICategory.FAT);
	}
	
	@Test
	public void enum_OBESE() {
		assertEquals(BMICategory.OBESE, BMICategory.OBESE);
	}

}
