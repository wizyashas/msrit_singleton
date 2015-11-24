/**
 * 
 */
package org.msrit.singleton;

/**
 * @author hogwarts
 *
 */
public class SingletonClassThreadSafe {
	private static SingletonClassThreadSafe instance = null;
	private static Object mutex = new Object();

	private SingletonClassThreadSafe() {
	}

	public static SingletonClassThreadSafe getInstance() {
		if (instance == null) {
			synchronized (mutex) {
				if (instance == null)
					instance = new SingletonClassThreadSafe();
			}
		}
		return instance;
	}
	
	/*
	 * Method will print the hash code of the object
	 */
	public void printMessage(){
		System.out.println("Hash code of the object is "+instance.hashCode());
	}
	
	/*
	 * Method will show fibonacci series for the given size
	 */
	public void fibonacciSeries(int size) {

		int n1 = 0, n2 = 1, n3, i, count = size;
		System.out.print("Fibonacci series "+n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are
									// already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}
}
