/* In this code, the reference of super class is made to point at 
the object of subclass. 
Method 'getName()' is defined in subclass (not present in super class). Then, 
trying to call that method using reference of super class will generate compile
time error
*/

class Person{
	String name;

	public Person(){
		name="Ashish";
	}
}

class Student extends Person{
	int age;
	Student(){
		super();
		age=20;
		name="Vishu";
	}

	String getName(){ //Defined here. This method is not overwridden (i.e. not in super class)
		return name;
	}
}

class Driver{
	public static void main(String[] args) {
		Person p=new Student(); //Reference of type Person & object of type Student
		System.out.println(p.name);// Works fine
		System.out.println(p.getName());// Compile time error

		//Reason: Method getName(), being defined in subclass, can't be invoked by using 
		// reference of superclass

		/* That is, compiler ensures that you envoke,on a reference, only those methods
		which are defined inside a class of type 'reference'. In this code, reference is p,
		which is of type Person.
		*/
	}
}