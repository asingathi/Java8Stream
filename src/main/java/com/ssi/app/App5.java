package com.ssi.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App5 {

	 public static void main( String[] args ) {

		 List<String> list = new ArrayList<String>();
		 list.add( "Raj" );
		 list.add( "Ajay" );
		 list.add( "Viv" );
		 list.add( "Ket" );
		 
		 //list.stream().sorted().forEach( System.out::println);
		 list.stream().sorted().map( x -> x.toLowerCase()).forEach( System.out::println);
		 
	 }
}
