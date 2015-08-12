package ilen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class PersonSorting {
	
	public PersonSorting() {
		// constructor
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 =  new Person("Mischa", "Barton", 1980);
		Person p2 =  new Person("Christian", "Bale", 1977);
		Person p3 =  new Person("Joan", "Collins", 1985);
		Person p4 =  new Person("Gemma", "Arterton", 1982);
		Person p5 =  new Person("Daniel", "Craig", 1980);
		
		// sorting by arrays
		Person[] persons = new Person[]{p1, p2, p3, p4, p5};
		Arrays.sort(persons, new PersonComparator());
		System.out.println("Sorting person by Arrays");
		for(Person p : persons)
			System.out.println("Person: " + p.getFistName() + " " + p.getLastName() + " Age: " + p.getAge());
		
		// sorting by list
		List<Person> lstPerson = new ArrayList<Person>();
		lstPerson.add(p1);
		lstPerson.add(p2);
		lstPerson.add(p3);
		lstPerson.add(p4);
		lstPerson.add(p5);
		Collections.sort(lstPerson, new PersonComparator());
		System.out.println("Sorting person by List");
		for(Person p : lstPerson)
			System.out.println("Person: " + p.getFistName() + " " + p.getLastName() + " Age: " + p.getAge());
	}

}
