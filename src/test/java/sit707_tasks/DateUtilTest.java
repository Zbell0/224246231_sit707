package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Eunji Kim
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "224246231";
		Assert.assertNotNull("Student ID is ", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Eunji Kim";
		Assert.assertNotNull("Student name is ", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
    
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1,1,2024);
		System.out.println("january1shouldIncrementToJanuary2 > " +date);
		date.increment();
		System.out.println(date);
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1,1,2024);
		System.out.println("january1ShouldDecrementToDecember31 >"+date);
		date.decrement();
		System.out.println(date);
	}
	
	@Test
	public void testFebruary28ShouldIncrementToMarch1InNonLeapyear() {
		DateUtil date = new DateUtil(28,2,2023);
		date.increment();
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(3,date.getMonth());
	}
	
	 @Test
	    public void testFebruary28ShouldIncrementToFebruary29InLeapYear() {
	        DateUtil date = new DateUtil(28, 2, 2024); 
	        date.increment();
	        Assert.assertEquals(29, date.getDay());
	        Assert.assertEquals(2, date.getMonth());
	    }

}
