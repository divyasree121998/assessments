package com.test.cars;

import java.util.Comparator;

public class Manyear implements Comparator<Cars>  {

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o1.getManyear()-o2.getManyear();
	}

}
