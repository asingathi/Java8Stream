package com.ssi.app;

import java.util.stream.Stream;

public class App2 {

	 public static void main( String[] args ) {

		 Stream.of( "Raj", "Ajay", "Viv", "Amar" )
		 .sorted().forEach( System.out::println );
		 
		 System.out.println();
		 
		 Stream.of( "Raj", "Ajay", "Viv", "Amar" )
		 .sorted()
		 .filter( x -> x.startsWith( "A" ) )
		 .forEach( x -> System.out.println( x ));

		 System.out.println();
		 
		 Stream.of( "Raj", "Ajay", "Viv", "Amar" )
		 .sorted()
		 .findFirst()
		 .ifPresent(System.out::println);
	 }
	 
}
