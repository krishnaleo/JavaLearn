package SortAlgorithms;

import java.util.stream.IntStream;

public class FrntBackSerach
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int array[]={1,23,7,56,41,63,111,225,56};


		System.out.println(array.length);

		System.out.println("Result in "+getindex(array,56));

	}

	static int getindex(int[] aray,int key)
	{

		int frnt=0;
		int back=aray.length-1;
		int indx=0;

		while(frnt<=back)
		{


				indx= (aray[frnt]==key)  ?    frnt  :  (aray[back]==key) ? back  : -1 ;
				if(indx==-1)
				{
					frnt++;
					back--;
				}

				if(indx!=-1)
					break;

		}




		return indx;
	}

}
