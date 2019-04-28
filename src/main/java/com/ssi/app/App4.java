package com.ssi.app;

import java.util.Arrays;
import java.util.stream.Stream;

public class App4 {

	 public static void main( String[] args ) {
		 
		 Arrays.stream( new int[] { 2, 4, 6, 8 } )
		 .map( x -> x * x )
		 .forEach( System.out::println );
		 
		 System.out.println();
		 Arrays.stream( new int[] { 2, 4, 6, 8 } )
		 .map( x -> x * x )
		 //.average().ifPresent( System.out::println);
		 //.min().ifPresent( System.out::println);
		 .max().ifPresent( System.out::println);
	 }
}
