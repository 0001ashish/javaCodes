//Multithreading Using Runnable Interface


class Exp implements Runnable{
	Thread t;
	Exp(String name){
		t=new Thread(this,name);
		System.out.println(t.getName()+t);
		t.start();
	}
	
	public void run(){
		try{
			for(int i=1;i<=5;i++){
				System.out.println(t.getName()+": "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println("Child Interrupted");
		}

		System.out.println("Exiting "+t.getName());
		
	}
}

class Driver{
	public static void main(String[] args) {

		new Exp("T1");
		new Exp("T2");
		System.out.println("Exiting Main");
	}
}