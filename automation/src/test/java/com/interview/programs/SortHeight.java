package com.interview.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortHeight {
		
	public static void main(String[] args){

        List<PeopleData> persons = new ArrayList<PeopleData>();
        persons.add(new PeopleData( 28, 150, 155));
        persons.add(new PeopleData( 25, 140, 135));
        persons.add(new PeopleData( 10, 80, 101));
        
        Collections.sort(persons);
        System.out.println(persons);

	}
	

}
