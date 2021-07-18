package packA;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassAtest {

	@Tag("Sanity")
	@DisplayName("First JunitTest in class A")
	@Test
	public void test1()
	{
		System.out.println("Inside test1 of class A");
	}
}
