import java.lang.reflect.Field;

class Driver1{
	public static void main(String[] args) {
		Bank ref=new Bank();
		Field[] fields=null;
		System.out.println("Hello");
		try{
			fields=Bank.class.getFields();
		}catch(Exception e){e.printStackTrace();}
		System.out.println("Hello");
		System.out.println(fields.length);
		for(int i=0;i<fields.length;i++){
			Object value=null;
			try{
				value=fields[i].get(ref);
			}catch(Exception e){e.printStackTrace();}

			System.out.println("Value of Field "+fields[i].getName()+" is "+value);
		}
	}
}