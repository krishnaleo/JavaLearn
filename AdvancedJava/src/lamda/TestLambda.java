package lamda;

public class TestLambda {

	public static void main(String[] args)
	{
		String x="Testing functional interface";

		//	functional interface calling, if the number of parameter is only one v can ignore the Data type
		System.out.println("*** \n\n Funcational Interface \n\n ****");
		functionalinterface fin=(val)->{System.out.println("The result "+val);};
		fin.print(x);;
		System.out.println("***\n\n Non functional interface \n\n ****");



		NonfunctionalInterface nfin=new NonfunctionalInterface()
				{

					@Override
					public void print(String val)
					{
						System.out.println(" Result fomr Non functional interface menthod(Print)"+val);
					}

					@Override
					public void print1(String val) {
						// TODO Auto-generated method stub
						System.out.println(" Result fomr Non functional interface menthod (Print 1)"+val);
					}


				};

				nfin.print("nfin OBJECT (Print)");

				nfin.print1("nfin OBJECT (Print1)");

	}
	
	

}
