package Algorithms.Ex;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while( !StdIn.isEmpty() ) {
			int N = StdIn.readInt();
			String s = "";
			for(int n=N; n>0; n/=2)
				s = (n%2) + s;
			StdOut.print(s);
		}
	}

}
