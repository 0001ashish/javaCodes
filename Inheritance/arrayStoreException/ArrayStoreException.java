/* In java, arrays of subclass references can be converted into 
arrays of superclass references without a cast. This is shown in 
example below
*/

class Person{
	String name;
	int money=10000;
	Person(String name){
		this.name=new String(name);
	}
}

class Student extends Person{
	int rollNo;
	int money=10000;
	Student(String name,int rollNo){
		super(name);
		this.rollNo=rollNo;
	}

	public void getScholarship(){
		money=money+10000;
	}
}

class Driver{
	public static void main(String[] args) {
		Student[] students=new Student[10];
		Person[] people=students;// Works

		people[0]=new Person("Ashish");
		/*Compiler will carefully allow above assignment. But  
		people[0] and students[0] are same references. So it looks
		as if we have managed to insert a Person as a Student as well.
		But problem is, calling students[0].getScholarship() would try
		to access non-existant field & would corrupt neighboring memory.

		To make sure that no such corruption can occur, all arrays 
		remember the element type with which they were created, and 
		they monitor that only compatible references are stored into
		them. For example, array created as Student[10] in this example
		remembers that it is an array of Student. Attempting to store 
		references of Person will cause an ArrayStoreException. You 
		will see this exception if you try to run this code.
		*/
	}
}