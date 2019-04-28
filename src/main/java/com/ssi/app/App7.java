package com.ssi.app;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App7 {

	 public static void main( String[] args ) {
		 
		 try {
			 Stream<String> data = Files.lines( Paths.get( "test1.txt" ) );
			 //List<String[]> newDataList = data.sorted().map( x -> x.split( "," ) ).filter( x -> x.length == 3 ).collect( Collectors.toList() );
			 //newDataList.forEach( x -> System.out.println( x[0] +" "+x[1] +" "+x[2] ) );
			 
			 List<String[]> newDataList = data.sorted().map( x -> x.split( "," ) ).filter( x -> Integer.parseInt( x[1] ) > 25 ).collect( Collectors.toList() );
			 newDataList.forEach( x -> System.out.println( x[0] +" "+x[1] +" "+x[2] ) );
			 
			 data.close();
		 } catch( Exception e ) {
			 System.err.println( e.toString() );
		 }
		 
	 }
	 
}
