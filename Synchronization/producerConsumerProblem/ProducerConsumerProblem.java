// This code illustrates the classic Producer Consumer Problem 
/* Although the put() and get() methods are synchronized, there is no
synchronization w.r.t. the speeds at which producer is producing & consumer 
is consuming. This is known as race condition

Following 2 Scenarios may arise:
	1. Producer is faster. In this case, producer will produce new item 
		before consumer could consume already existing one...
	2. Consumer is faster. In this case, consumer,being fast, could consume 
		same item again(because produer hasn't produced new item & consumer
		don't realize that it should wait).
*/
class Q{
	int n;

	synchronized public void put(int n){
		this.n=n;
		System.out.println("Put: "+n);
	}

	synchronized public int get(){
		System.out.println("Got: "+n);
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
				Thread.sleep(300);
				q.put(i++);
			}catch(InterruptedException e){e.printStackTrace();}
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
				Thread.sleep(1000);
				q.get();
			}catch(InterruptedException e){e.printStackTrace();}
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