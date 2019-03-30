package kim.generic;

public class MyGeneric<E> {

	E myVar;
	//E element K key N number T Type
	public MyGeneric(E initialVal) {
		myVar = initialVal;
	}
	
	public E getMyVar() {
		return myVar;
	}
}
