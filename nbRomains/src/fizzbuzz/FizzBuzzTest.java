package fizzbuzz;

import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {
	@Test
	public void Test() {
		assertEquals(FizzBuzz.chose(3),"Fizz");
		assertEquals(FizzBuzz.chose(4),"4");
		assertEquals(FizzBuzz.chose(5),"Buzz");
		assertEquals(FizzBuzz.chose(15),"FizzBuzz");
	}
}
