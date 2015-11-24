/**
 * 
 */
package org.msrit.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author hogwarts
 *
 */
public class MainClass {
	
	class Runnable2 implements Runnable{
		SingletonClassThreadSafe singletonThreadSafeObject = null;
	    public void run(){
	    	
	    	int count = 10;
			for (int i = 0; i < 5; i++) {
				
				System.out.println(" \nCreating object of Singleton class of thread 2 \n We will find fibonacci series until count = "+count);
				singletonThreadSafeObject = SingletonClassThreadSafe.getInstance();
				singletonThreadSafeObject.printMessage();
				singletonThreadSafeObject.fibonacciSeries(count);
				
				count = count+1;
			}
			
	    }
	}

	class Runnable1 implements Runnable{
		SingletonClassThreadSafe singletonThreadSafeObject = null;
	    public void run(){
	    	
	    	int count = 10;
			for (int i = 0; i < 5; i++) {
				
				System.out.println(" \nCreating object of Singleton class of thread 1 \n We will find fibonacci series until count = "+count);
				singletonThreadSafeObject = SingletonClassThreadSafe.getInstance();
				singletonThreadSafeObject.printMessage();
				singletonThreadSafeObject.fibonacciSeries(count);
				
				count = count+1;
			}
			
	    }
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonClassLazy singletonLazyObject = null;
		SingletonClassEager singletonEagerObject = null;
		SingletonClassThreadSafe singletonThreadSafeObject = null;
		
		int inputValue = 0;

		System.out.println("1. Singleton Eager Implementation");
		System.out.println("2. Singleton Lazy Implementation");
		System.out.println("3. Singleton Thread Safe Implementation");

		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String s = bufferRead.readLine();
			inputValue = Integer.parseInt(s);

			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		switch (inputValue) {
		case 1:
			int count = 10;
			for (int i = 0; i < 5; i++) {
				
				System.out.println(" \nCreating object of Singleton class \n We will find fibonacci series until count = "+count);
				singletonEagerObject = SingletonClassEager.getInstance();
				singletonEagerObject.printMessage();
				singletonEagerObject.fibonacciSeries(count);
				
				count = count+1;
			}
			
			break;
		case 2:
			count = 10;
			for (int i = 0; i < 5; i++) {
				
				System.out.println(" \nCreating object of Singleton class \n We will find fibonacci series until count = "+count);
				singletonLazyObject = SingletonClassLazy.getInstance();
				singletonLazyObject.printMessage();
				singletonLazyObject.fibonacciSeries(count);
				
				count = count+1;
			}
			break;
		case 3:
			MainClass mClass = new MainClass();
			Runnable r = mClass.new Runnable1();
	        Thread t = new Thread(r);
	        Runnable r2 = mClass.new Runnable2();
	        Thread t2 = new Thread(r2);
	        t2.start();
	        t.start();
			
			
		break;

		default:
			break;
		}
		

	/*	System.out.println("Creating object of Singleton class");

		for (int index = 0; index < 5; index++) {

			singletonObject = SingletonClassLazy.getInstance();
			System.out.println("hashcode of my object will be printed now");

			singletonObject.printMessage();

			System.out.println("Before Incrementing the value");

			singletonObject.printValue();

			singletonObject.incrementCount();

			System.out.println("After Incrementing the value");

			singletonObject.printValue();

		}
*/
		System.out.println("\nEnd");

		
	}
	
	
}
