// Multithreading by extending Thread Class

class MultiThreads extends Thread{
	int num;
	MultiThreads(int n){
		num=n;
	}
	public void run(){
		try{
			for(int i=1;i<=10;i++){
				System.out.println("Thread "+this.getName()+": "+num*i);
				sleep(400);
			}
		}
		catch(InterruptedException e){
			System.out.println("Thread "+this.getName()+" Exited");
		}
	}
}

class Driver{
	public static void main(String[] args) {
		MultiThreads m1=new MultiThreads(7);
		MultiThreads m2=new MultiThreads(10);
		m1.start();
		m2.start();
	}
}