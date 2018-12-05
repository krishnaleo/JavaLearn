package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MethodReference
{
	String x;
	String y;
	public MethodReference(String x, String y)
	{
		super();
		this.x = x;
		this.y = y;
	}

	public static void Test( String s )
	{
		System.out.println( s );
	}

	public static void print(String val)
	{
		System.out.println(val);

	}


		public static void main( String[] args )
		{


			final Collection< String > strings = Arrays.asList( "s1", "s2", "s3" );


			MethodReference obj1=new MethodReference("1","2");

			MethodReference obj2=new MethodReference("3","4");





			strings.stream().forEach( ReferenceClass::new  );


		}

}
class ReferenceClass
{

	static String x;



	public ReferenceClass(String x) {
		super();
		this.x = x;
System.out.println("Inside the COnsturctor "+ x);
	}



}