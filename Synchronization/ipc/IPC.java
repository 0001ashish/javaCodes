/* This is the correct implementation of producer and consumer scenario and
is achieved via Inter-process Communication.

Methods used for Inter-process Communication in java are:
	1. wait()
	2. notify()
	3. notifyAll()

	These are the methods of Object class and so are available in all 
	classes.
*/

class Q{
	int n;
	boolean valSet=false;

	synchronized public void put(int n){
		if(valSet){
			try{
				wait();
			}catch(InterruptedException e){e.printStackTrace();}
		}
		this.n=n;
		valSet=true;
		System.out.println("Produced: "+n);
		notify();
		
	}

	synchronized public int get(){
		if(!valSet){
			try{
				wait();
			}catch(InterruptedException e){e.printStackTrace();}
		}
		valSet=false;
		System.out.println("Consumed: "+n);
		notify();
		return n;
	}
}

class Producer implements Runnable{
	Q q;
	Producer(Q q){
		this.q=q;
		new Thread(this).start();
	}

	public void run(){
		int i=0;

		while(true){
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e) {e.printStackTrace();}
			q.put(i++);
		}
	}
}

class Consumer implements Runnable{
	Q q;
	Consumer(Q q){
		this.q=q;
		new Thread(this).start();
	}

	public void run(){
		while(true){
			try{
				Thread.sleep(300);
			}catch(InterruptedException e){e.printStackTrace();}
			q.get();
		}
	}
}

class PC{
	public static void main(String[] args) {
		Q q=new Q();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
	}
}