package com.test.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Sort {
	Map<String, List<Cars>> carshow;
	public void displayCarsByShowroomname(String showroomname)
	{
		List<Cars> cars=carshow.get(showroomname);
		for(Cars car: cars) {
			System.out.println(car);
	}
	}
	//
	Map<String, List<Cars>> carshow1;
	public void displayByshowroomname2(String name)
	{
		List<Cars> cars=carshow1.get(name);
		Collections.sort(cars,new Manyear());
		for(Cars car:cars) {
			System.out.println(car);
		}
	Collections.sort(cars,new Carname());
	for(Cars car: cars) {
		System.out.println(car);
	}
	}
	
	public static void main(String[] args) {
		Cars c1=new Cars(1990, "Maruthi");
		Cars c2=new Cars(1998, "Estilo");
		Cars c3=new Cars(1970, "Ford");
		Cars c4=new Cars(2000, "Renault duster");
		List<Cars>cars1=new ArrayList<Cars>();
		cars1.add(c1);
		cars1.add(c2);
		cars1.add(c3);
		cars1.add(c4);
		Showroom showroom=new Showroom("xyz automobiles", 1000, cars1);
		
		Cars c5=new Cars(2015,"Honda" );
		Cars c6=new Cars(2010,"BMW" );
		Cars c7=new Cars(1978,"Benz" );
		List<Cars>cars2=new ArrayList<Cars>();
		cars2.add(c5);
		cars2.add(c6);
		cars2.add(c7);
		Showroom showroom1=new Showroom("abc automobiles", 500, cars2);
		
		Sort s=new Sort();
		
		s.carshow=new HashMap<String,List<Cars>>();
		s.carshow.put(showroom.getShowroom(), showroom.getCars());
		s.carshow.put(showroom1.getShowroom(), showroom1.getCars());
		
		s.displayCarsByShowroomname("xyz automobiles");
		
		
		
	}
}



