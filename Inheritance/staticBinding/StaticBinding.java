/* private,final and static members(methods & veriables) use static
binding...

Static binding is done based on type of the reference and not on the
referenced object. This is done at compile time

This Scenario has been explained below.
*/

class Super{
	public static void method(){
		System.out.println("Super Class Method...");
	}
}

class Sub extends Super{
	public static void method(){
		System.out.println("Sub class Method...");
	}//This is not overwridden method. Static methods are not overwridden.
}

class Driver{
	public static void main(String[] args) {
		Super ref=new Super();//reference 'ref' is of type Super
		ref.method();
		Super ref2=new Sub();//reference 'ref' is of type Super
		ref2.method();
	}
}