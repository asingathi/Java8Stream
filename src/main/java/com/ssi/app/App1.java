package com.ssi.app;
import java.util.stream.IntStream;

public class App1 {

	 public static void main( String[] args ) {
		 // Integer Stream
		 IntStream.range(1,10).forEach( System.out::println); // prints 1 thru 9
		 IntStream.range(1,10).skip( 5 ).forEach( System.out::println); // prins 6 thru 9
		 
		 IntStream.range(1,10).skip( 3 ).forEach( x -> System.out.println( x )); // prins 4 thru 9
		 
		 int aa = IntStream.range(1,4).sum();
		 System.err.println( aa );
		 System.out.println( IntStream.range(1,4).sum() );
		 long cnt = IntStream.range(1,4).count();
		 System.err.println( "Count "+cnt );
	 }
	 
}
