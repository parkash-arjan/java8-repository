package com.java8.lambda.method_reference;

class MyObject {

	private String str = null;

	public MyObject(String str) {
		System.out.println("MyObject Constructor " + str);
		this.str = str;
	}

	@Override
	public String toString() {
		return this.str;
	}
}

interface MyObjectInterface {
	public MyObject get(String str);
}

public class ConstructorRef {

	public static void main(String[] args) {
		// lambda way
		MyObjectInterface myObjectInterface = (s) -> {
			MyObject myObject = new MyObject(s);
			return myObject;
		};

		MyObject myObject = myObjectInterface.get("Value String");
		System.out.println(myObject);

		// Constructor Reference
		MyObjectInterface myObjectInterf = MyObject::new;
		MyObject myObject1 = myObjectInterf.get("get internally calls MyObject constructor by passing str ");
		System.out.println(myObject1);

	}

}
