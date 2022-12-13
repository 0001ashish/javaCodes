/* This code illustrates dynamic binding.
In dynamic binding, which method to call is decided based on the type
of referenced object. N
Compiler cannot decide for itselt which object the reference is 
is refering to... So this type of binding can only be done at run time.
That's why the name dynamic(run-time) bbinding.
*/

class Super{
	public void method(){
		System.out.println("Super class method...");
	}
}

class Sub extends Super{
	public void method(){
		System.out.println("Sub class method...");
	}
}

class Driver{
	public static void main(String[] args) {
		Super ref1=new Super();//Object is of type Super
		ref1.method();
		Super ref2=new Sub();//Object is of type Sub
		ref2.method();
	}
}