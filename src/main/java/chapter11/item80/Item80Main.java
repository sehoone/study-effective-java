package chapter11.item80;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Item80Main {

	public static void main(String[] args) throws Exception {
		/**
		 * 스레드보다는 실행자, 태스크, 스트림을 애용하라
		 * 
		 */
		final int MAX_SIZE = 3;
		ExecutorService executorService = Executors.newFixedThreadPool(MAX_SIZE);
		ExecutorCompletionService<String> executorCompletionService = new ExecutorCompletionService<>(executorService);

		List<Future<String>> futures = new ArrayList<>();
		futures.add(executorCompletionService.submit(() -> "madplay"));
		futures.add(executorCompletionService.submit(() -> "kimtaeng"));
		futures.add(executorCompletionService.submit(() -> "hello"));

		for (int loopCount = 0; loopCount < MAX_SIZE; loopCount++) {
		    try {
		        String result = executorCompletionService.take().get();
		        System.out.println(result);
		    } catch (InterruptedException e) {
		        //
		    } catch (ExecutionException e) {
		        //
		    }
		}
		executorService.shutdown();
	}
}
