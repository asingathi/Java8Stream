package com.ssi.app;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App10 {

	 public static void main( String[] args ) {
		 
		 try {
		
			 Stream<String> data = Files.lines( Paths.get( "test1.txt" ) );
			 List<Person> list = data.sorted().map( x -> x.split( "," ) ).filter( x -> x.length == 3 )
			 .map( x -> new Person(x[0], Integer.parseInt(x[1]), x[2])).collect( Collectors.toList() );
			 list.forEach( p -> System.out.println( p.extract() ) );
			 data.close();
		 } catch( Exception e ) {
			 System.err.println( e.toString() );
		 }
		 
	 }

	 public static Function<String, Person> mapToPerson = (line) -> {
		  String[] p = line.split(",");
		  return new Person(p[0], Integer.parseInt(p[1]), p[2]);
	 };

	 
	 private static class Person {
		private String name;
		private int age;
		private String gender;
		 
		public Person( String name, int age, String gender ) {
			this.name=name;
			this.age=age;
			this.gender=gender;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String extract() {
			return name +" "+age+" "+gender;
		}
	 }
}
