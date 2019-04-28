package com.ssi.app;

import java.util.Arrays;
import java.util.stream.Stream;

public class App3 {

	 public static void main( String[] args ) {
		 String names[] = { "Raj", "Viv", "Ajay", "Keth" };
		 Stream.of( names )
		 .sorted()
		 .forEach( System.out::println );
		 
		 System.out.println();
		 
		 Arrays.stream(names)
		 .sorted().filter( n -> n.startsWith( "V" ) )
		 .forEach( System.out::println );
		 
	 }
}
