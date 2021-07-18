package packB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassBtest {
	@Tag("Sanity")
	@DisplayName("First JunitTest in class B")
	@Test
	public void test2()
	{
		System.out.println("Inside test2 of class B");
	}

}
