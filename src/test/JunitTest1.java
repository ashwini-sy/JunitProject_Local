package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JunitTest1 {
	@Test
	public void test1()
	{
		String s="hi";
	    String s2="hi";
	    assertEquals(s, s2);
		System.out.println("assert conditon is true");
	}

}
