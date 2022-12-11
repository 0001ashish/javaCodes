class PasswordBreaker extends Thread{
	int base;
	static boolean found=false;
	Bank ref=new Bank();
	PasswordBreaker(int b,Bank ref){base=b;this.ref=ref;}
	public void run(){
		for(int i=base;i<base+100;i++){

			if(found){
				break;
			}
			if(ref.login(i)){
				found=true;
				System.out.println("Password: "+i);
			}
		}
	}
}
class Driver{
	public static void main(String[] args) {
		Bank b1=new Bank();
		PasswordBreaker [] p=new PasswordBreaker[10];
		for(int i=0;i<10;i++){
			p[i]= new PasswordBreaker(i*100,b1);
			p[i].start();
		}	
	}
}