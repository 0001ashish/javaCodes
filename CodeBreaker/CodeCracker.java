import java.time.Duration;

class PasswordBreaker extends Thread{
	int base;
	static boolean found=false;
	Bank ref=new Bank();
	PasswordBreaker(int b,Bank ref){base=b;this.ref=ref;}
	public void run(){
		for(int i=base;i<base+10;i++){
			if(found){
				break;
			}
			if(ref.login(i)){
				found=true;
				System.out.println("Password: "+i);
				break;
			}
		}
	}
}
class Driver{
	public static void main(String[] args) {
		Bank b1=new Bank();
		PasswordBreaker [] p=new PasswordBreaker[3];

		long start;
		long end;
		for(int i=0;i<3;i++){
			p[i]= new PasswordBreaker(210+10*i,b1);

			start[0]=System.nanoTime();
			p[i].start();
		}
	}
}