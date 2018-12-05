package Concurency;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadsWithReturnType {

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{




		ExecutorService executor = Executors.newFixedThreadPool( 10 );



		Future result = executor.submit(new Callable()
		{

			public Object call() throws Exception
			{
				 Random generator = new Random();
				 Integer randomNumber = generator.nextInt(5);
				 return randomNumber;
			}
		});


		Integer data=(Integer)result.get();
		System.out.println(result.isDone());

		System.out.println(data);

		executor.shutdown();

		System.out.println(result.isDone());



	}



}


