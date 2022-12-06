/* When an object of subclass is created, the constructor of it's super class
gets envoked before the constructor of subclass.
*/

class SuperClass{
	String name;

	// It is good practice to explicitly define a default Constructor whenever you
	// have a parameterized constructor
	// Reason being explained in comment at the top
	public SuperClass(){ 
	}
	public SuperClass(String n){
		name=n;
	}
}

class SubClass extends SuperClass{
	public SubClass(String s){
		super(s);
	}
}

class Driver{
	public static void main(String[] args) {
		SubClass obj=new SubClass("Ashish");
		System.out.println(obj.name);
	}
}