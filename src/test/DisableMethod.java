package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;

public class DisableMethod {

	@CustomAnnotation
	public void  palindromesceanrio()
	{
		assertTrue(Palindrome.palindromeTest("madam"));	
	}
	
	@Disabled
	public void  palindromesceanrio2()
	{
		assertTrue(Palindrome.palindromeTest("madam"));	
	}
}
