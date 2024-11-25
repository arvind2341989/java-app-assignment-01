import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EvenAndOddNumberTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@BeforeEach
	public void setup() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@AfterEach
	public void tearDown() {
		System.setOut(standardOut);
	}
	
	@Test
	void test1() {
		EvenAndOddNumber.main(new String[]{"10"});
		
		assertEquals("It's an even number.", outputStreamCaptor.toString());
	}
	
	@Test
	void test2() {
		EvenAndOddNumber.main(new String[]{"11"});
		
		assertEquals("It's an odd number.", outputStreamCaptor.toString());
	}
}