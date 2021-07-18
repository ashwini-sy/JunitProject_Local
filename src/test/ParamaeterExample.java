package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.WeekFields;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamaeterExample {

	@ParameterizedTest
	@ValueSource(strings = { "madam", "radar", "ara" })
	public void palindromecheck(String name) {
		assertTrue(Palindrome.palindromeTest(name));
	}

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 8 })
	public void evennumcheck(int num) {
		assertTrue(num % 2 == 0);
	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void monthTest(Month mn)
	{
		int monthnum=mn.getValue();
		assertTrue(monthnum>=1 && monthnum<=12);	
		
	}
	
	//Month has morethan 30days
	@ParameterizedTest
	@EnumSource(value=Month.class,names= {"APRIL","SEPTEMBER","JUNE"})
	public void monthhasmore30days(Month mn)
	{
			
		assertEquals(30, mn.length(false));
	}
	
	//LeapYearcheck
	@ParameterizedTest
	@EnumSource(value=Month.class,names= {"FEBRUARY"})
	public void LeapYearTest(Month mn)
	{
		boolean  leapyr=false;
		assertEquals(28, mn.length(leapyr));
	}
	
	@ParameterizedTest
	@EnumSource(DayOfWeek.class)
	public void weektest(DayOfWeek day)
	{
		int weeknum=day.getValue();
		assertTrue(weeknum>=1 && weeknum<=7);	
		
	}
	
	@ParameterizedTest
	@CsvSource(value= {"test:tEst", "java:java" , "test:test"}, delimiter= ':')
	public void comparing_sentencestest(String Expected,String Actual)
	{
		assertEquals(Expected, Actual);
		
	}
	
	@ParameterizedTest
	@MethodSource("StringMethod")
	public void methodSource(String str)
	{
		assertNotNull(str);
		assertTrue(Palindrome.palindromeTest(str));
	}
	
	
	public static Stream<String> StringMethod()
	{
		return Stream.of("radar","mom","dad","mama");
	}
	
	
	
	//dateconverter
	@ParameterizedTest
    @CsvSource({"2018/12/25,2018", "2019/02/11,2019"})
    void getYear( @ConvertWith(Dateconverter.class) LocalDate date, int expected) {
       assertEquals(expected, date.getYear());


	}

}
