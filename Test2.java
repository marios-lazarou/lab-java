/**
 * 
 */
package sts;

public class Test2 {
	
	/*
	 * What will happen if these two methods are called by different threads?
	 * 
	 * The cases where the validation will fail are:
	 * 1) In case that values in between dots are 3 digits and starting with 0 eg: 000
	 * 2) Values that are more than 255
	 */
	public void mym1() {
		synchronized (String.class) {
			System.out.println("mym1 - In sychronized for String.class object");
			synchronized (Integer.class) {
				System.out.println("mym1 - In Synchronized for Integer.class object");
			}
		}
	}

	public void mym2() {
		synchronized (Integer.class) {
			System.out.println("mym2 - In Synchronized for Integer.class object");
			synchronized (String.class) {
				System.out.println("mym2 - In sychronized for String.class object");
			}
		}
	}
}
