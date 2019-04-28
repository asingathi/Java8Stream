package com.ssi.app;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App6 {

	 public static void main( String[] args ) {
		 
		 try {
			 Stream<String> data = Files.lines( Paths.get( "test.txt" ) );
			 //data.sorted().forEach( System.out::println );
			 //data.filter(x->x.length()>9).forEach( System.out::println );
			 
			 List<String> list = data.sorted().collect( Collectors.toList() );
			 list.forEach( x -> System.out.println(x));
			 
			 data.close();
			 
		 } catch( Exception e ) {
			 System.err.println( e.toString() );
		 }
		 
	 }
}
