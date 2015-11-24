/**
 * 
 */
package org.msrit.singleton;

/**
 * @author hogwarts
 *
 */
public class SingletonClassEager {

	private static SingletonClassEager singleton = new SingletonClassEager( );
	   
	   /* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	   private SingletonClassEager(){ }
	   
	   /* Static 'instance' method */
	   public static SingletonClassEager getInstance( ) {
	      return singleton;
	   }
	   
		/*
		 * Method will print the hash code of the object
		 */
		public void printMessage(){
			System.out.println("Hash code of the object is "+singleton.hashCode());
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
