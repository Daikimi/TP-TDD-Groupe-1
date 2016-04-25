package nbRom;

import static org.junit.Assert.*;

import org.junit.Test;

public class nbRomTest {
	@Test
	public void Test() {
		assertEquals(nbRom.change(1),"I");
		assertEquals(nbRom.change(1000),"M");
		assertEquals(nbRom.change(1001),"MI");
		assertEquals(nbRom.change(1003),"MIII");
		assertEquals(nbRom.change(521),"DXXI");
		assertEquals(nbRom.change(1244),"MCCXLIV");
	}

}
