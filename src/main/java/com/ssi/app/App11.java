package com.ssi.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App11 {

	 public static void main( String[] args ) throws Exception {
		 
		 Files.newDirectoryStream( Paths.get("./files"), path -> path.toString().endsWith( ".txt") )
		 .forEach( x ->  {
			try {
				System.out.println( "file "+x.getFileName() );
				Stream<String> data1 = Files.lines( x );
				data1.forEach( System.out::println );
				data1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		 });
		 
		 
		 
	 }
	 
}
