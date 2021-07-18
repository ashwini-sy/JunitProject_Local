package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;

import org.junit.jupiter.api.TestFactory;

public class DynamicTest1 {
	//multiple testcase in single method
    @TestFactory
	public  Collection<DynamicTest>  dynamictest() {
		// ()-> lambda expression
	 return Arrays.asList(DynamicTest.dynamicTest("Testcase-1", ()->assertTrue(Palindrome.palindromeTest("madam"))),
			 DynamicTest.dynamicTest("Testcase-2", ()->assertFalse(Palindrome.palindromeTest("madama")))
				 );
	}

}
