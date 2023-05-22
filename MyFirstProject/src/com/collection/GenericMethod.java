package com.collection;

class Fun
{
public <E> void array(E[] elements)
{
	for(E e : elements)
	{
		System.out.println(e);
	}
}
}
public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intarray= {10,20,30};
		Float[] floatarray= {10.2f,20.5f,30.6f};
		String[] stringarray= {"java","spring","angular"};
		Fun f = new Fun();
		f.array(intarray);
		f.array(floatarray);
		f.array(stringarray);
	}
}
