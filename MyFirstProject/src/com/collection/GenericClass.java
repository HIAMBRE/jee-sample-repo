package com.collection;
class Generic<T>
{
T obj;
void add(T obj) {
	this.obj=obj;
}
T get() {
	return obj;
}
}
public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<Integer> g = new Generic<>();
		g.add(10);
		System.out.println(g.get());
	}

}
