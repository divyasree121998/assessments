package com.test.cars;

import java.util.Comparator;

public class Carname implements Comparator<Cars>{

	@Override
	public int compare(Cars a1, Cars a2) {
		// TODO Auto-generated method stub
		return a1.getName().compareTo(a2.getName());
	}

}
