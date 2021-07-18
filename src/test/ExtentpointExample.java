package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

//based on the "ENVCheck" condition ,if the contion mateched then only both the method in ExtentpointExample vl execute
@ExtendWith(EnvCheck.class)
public class ExtentpointExample {
	@CustomAnnotation
	public void  palindromesceanrio()
	{
		assertTrue(Palindrome.palindromeTest("madam"));	
	}
	
	@Test
	public void  palindromesceanrio2()
	{
		assertTrue(Palindrome.palindromeTest("madam"));	
	}

}
