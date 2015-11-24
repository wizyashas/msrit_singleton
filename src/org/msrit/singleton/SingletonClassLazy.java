/**
 * 
 */
package org.msrit.singleton;

/**
 * @author yashas Lazy initialization of Class instance
 *
 */
public class SingletonClassLazy {

	private static SingletonClassLazy staticClassInstance;
	private static int countVariable = 0;

	/*
	 * Private constructor to avoid create new object with constructors
	 */
	private SingletonClassLazy() {
	}

	public static SingletonClassLazy getInstance() {

		if (staticClassInstance == null) {
			staticClassInstance = new SingletonClassLazy();
		}

		return staticClassInstance;
	}

	/*
	 * Method will print the hash code of the object
	 */
	public void printMessage() {
		System.out.println("Hash code of the object is " + staticClassInstance.hashCode());
	}

	/*
	 * Method will increment the count of the static variable
	 */
	public void incrementCount() {
		countVariable = countVariable + 1;
	}

	public void printValue() {
		System.out.println("The value of the counter is " + countVariable);
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
