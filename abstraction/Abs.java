// Abstract class
 
// Abstract class declaration start with 'abstract' keyword

// A class is called abstract if there is atleast one abstract method

abstract class Person{
	private String name;

	public Person(String n){
		name=n;
	}

	public String getPerson(){
		return name;
	} 

	//Abstract methods are declared with 'abstract' keyword
	public abstract String getDescription();
}


class Student extends Person{

	public Student(){
		super("Ashish");
	}
	public String getDescription(){
		return "Student name: "+getPerson();
	}

	public String toString(){
		return getDescription();
	}
}

/* When you extend an abstract class,just like Student class is extending Person class,
 in this example, you have two choices. 
	1. You can leave some or all of the abstract methods undefined. In such case, 
	you have to tag the subclass as 'abstract'.
	i.e. abstract class Student extends Person{}

	2. You can define all methods. In this case, subclass will not be abstract.
*/
class Driver{
	public static void main(String[] args) {
		Student std1= new Student();
		System.out.println(std1);
	}
}