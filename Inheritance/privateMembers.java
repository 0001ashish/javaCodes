//While inheriting, private fields are not inherited in a 
//'SUB CLASS'

import java.lang.reflect.Field;

class Super{
	private String name;
	String nm;
	Super(){
		this.name=new String("Ashish");
		nm=new String("Ash");
	}

	String getName(){
		return name;
	}
}

class Sub extends Super{
	int salary;

	Sub(int salary,String name){
		this.salary=salary;
	}
}

class Driver{
	public static void main(String[] args) {
		Super obj=new Super();
		Field privateField=null;
		try{
			privateField=Super.class.getDeclaredField("name");
		}catch(Exception e){System.out.println("Couldn't find name");}

		privateField.setAccessible(true);
		try{
			System.out.println(privateField.get(obj).toString());
		}catch(Exception e){System.out.println("I don't know...Something is Illigal");}
	}
}