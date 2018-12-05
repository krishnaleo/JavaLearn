package Functional;

import org.junit.Test;

import junit.framework.TestCase;

public class TestFunction extends TestCase
{


	FunctionProgrm obj=new FunctionProgrm();


	String x=obj.result();

	@Test
	public void  test_returndata()
	{
		assertEquals("here",x);
	}



}
