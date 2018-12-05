package JunitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class MethodClassTest
{

	int x,y;

	public MethodClassTest(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	MethodClass obj=null;

	@Parameters
	public static Collection test()
	{

		System.out.println("Here in paramter");
		List<TwoNumber> data=new ArrayList();
		data.add(new TwoNumber(1,4));
		return data;
	}



	@Test
	public void testSum()
	{
		System.out.println("Entered Here");
		assertEquals(obj.Sum(x, y), 5);
	}

}
class TwoNumber
{
	int x;
	int y;

	public TwoNumber(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}