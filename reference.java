class Methods extends Thread{
	int temp=20;
	Methods ref;
	Methods(){}
	Methods(Methods ref){
		this.ref=ref;
	}

	public void run(){
		System.out.println(ref.temp);
		try{
			sleep(1500);
		}catch(InterruptedException e){}
		System.out.println(ref.temp);
	}
}

class Driver{
	public static void main(String[] args) {
		Methods tmp=new Methods();
		Methods obj=new Methods(tmp);
		obj.start();
		try{
			Thread.sleep(500);
		}catch(InterruptedException e){}
		tmp.temp=46;
	}
}