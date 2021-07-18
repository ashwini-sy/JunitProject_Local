package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class PalindromeTest {
	
	@BeforeAll
	public static  void setup()
	{
		
		
		System.setProperty("ENV", "PROD");
	}
	
	@Test
	public void testcase1() {
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		assertTrue(Palindrome.palindromeTest("madam"));		
	}
	
	@Test
	public void testcase2() {	
		assumeTrue("PROD".equals(System.getProperty("ENV")));
		assertFalse(Palindrome.palindromeTest("madama"));		
	}

}
