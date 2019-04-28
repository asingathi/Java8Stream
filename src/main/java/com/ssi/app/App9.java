package com.ssi.app;

import java.util.stream.Stream;

public class App9 {

	 public static void main( String[] args ) {
		 
		 int aa = Stream.of( 1,2,3).reduce( 0, (Integer a, Integer b) -> a+b);
		 System.out.println( aa );
		 
	 }
	 
}
