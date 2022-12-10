import java.lang.reflect.Field;
import java.io.*;
class Driver{
	public static void main(String[] args) {
		File file=null;
		BufferedReader br=null;
		String str=null;
		int pass=0;
		try{
			file=new File("wordList.txt");
			br=new BufferedReader(new FileReader(file));
		}catch(Exception e){}
		try{
			while((str=br.readLine())!=null){
				Bank ref=new Bank();
				Field privateField=null;
				try{
					privateField=Bank.class.getDeclaredField(str);
				}catch(Exception e){continue;}
	
				privateField.setAccessible(true);

				try{
					pass=Integer.valueOf(privateField.get(ref).toString());
				}catch(Exception e){}
				System.out.println(pass);
				break;

			}
		}catch(Exception e){}

		Bank ref=new Bank();
		ref.login(pass);
	}
}