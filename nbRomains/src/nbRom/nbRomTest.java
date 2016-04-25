package nbRom;

import static org.junit.Assert.*;

import org.junit.Test;

public class nbRomTest {
	@Test
	public void Test() {
		assertEquals("I",nbRom.change(1));
		assertEquals("M",nbRom.change(1000));
		assertEquals("MI",nbRom.change(1001));
		assertEquals("MIII",nbRom.change(1003));
		assertEquals("DXXI",nbRom.change(521));
		assertEquals("MCCXLIII",nbRom.change(1243));
		assertEquals("MCCXLIV",nbRom.change(1244));
	}

}
