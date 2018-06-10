package main;

public class Application {

	public static void main(String[] args) {
		
		Task taskRunner = new Task();
		taskRunner.start();
		
		System.out.println("hello world...");

		Task taskRunner2 = new Task();
		taskRunner2.start();
	}

}