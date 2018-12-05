package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class TestCase
{


	MethodClass calculation = new MethodClass();
	int sum = calculation.Sum(2, 5);
	int testSum = 7;

	@Test
	public void testSum()
	{
		System.out.println("@Test sum(): " + sum + " = " + testSum);

		assertEquals(sum, testSum);
/*
		assertNull("NOt Null",null);

		assertNotNull("IS Null",sum);
*/
	}


	@Parameters
	public static void test()
	{
		System.out.println("Inside Test method");
	}

}
