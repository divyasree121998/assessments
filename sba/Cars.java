package com.test.cars;

public class Cars  {
	int manyear;
	private String name;
	public int getManyear() {
		return manyear;
	}
	public void setManyear(int manyear) {
		this.manyear = manyear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cars(int manyear, String name) {
		super();
		this.manyear = manyear;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cars [manyear=" + manyear + ", name=" + name + "]";
	}
	public Cars() {}
	
}