package ilen;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		
		// if p1 and p2 are null mean they are equals
		if(p1==null && p2==null)
			return 0;
		
		// if once element is null then left once is greater
		if(p1==null)
			return -1;
		if(p2==null)
			return 1;
		
		// sorting ascending by age
		int value = p1.getAge() - p2.getAge();
		if(value!=0)
			return value;
		
		// if age are equal so compare fist name
		value = p1.getFistName().compareTo(p2.getFistName());
		if(value!=0)
			return value;
		
		// continue compare last name if fist name are equals
		value = p1.getLastName().compareTo(p2.getLastName());
		return value;
	}
}
