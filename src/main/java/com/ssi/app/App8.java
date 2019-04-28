package com.ssi.app;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App8 {

	 public static void main( String[] args ) {
		 
		 try {
			 Stream<String> data = Files.lines( Paths.get( "test1.txt" ) );
			 Map<String, String> map = data.sorted().map( x -> x.split( "," ) )
			.filter( x -> x.length == 3 )
			.filter( x -> Integer.parseInt( x[1] ) > 25 )
			.collect( Collectors.toMap( x -> x[0], x-> x[1] ) );
			 
			 for( String key : map.keySet() ) {
				 System.out.println( key +" "+ map.get( key ) );
			 }
			 
			 data.close();
		 } catch( Exception e ) {
			 System.err.println( e.toString() );
		 }
		 
	 }
	 
}
