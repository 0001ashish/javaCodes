//Synchronization can be achieved in one of two ways:
	//1.Synchronized Methods
	//2.Synchronized Statement

//This program illustrates Synchronized Method


class Printer{

	synchronized public void genPrint(String content){
		System.out.print("[ ");
		try{
			Thread.sleep(300);
			System.out.print(content);
			System.out.println(" ]");
		}catch(InterruptedException e){}
	}
}

class DocGenerator implements Runnable{
	Printer hpLaser;
	String msg;
	DocGenerator(Printer ref,String s){
		hpLaser=ref;
		msg=s;
		Thread t=new Thread(this);
		t.start();
	}

	public void run(){
		hpLaser.genPrint(msg);
	}
}

class Driver{
	public static void main(String[] args) {
		Printer hpLaser=new Printer();
		DocGenerator mac1=new DocGenerator(hpLaser,"Riemann Hypothesis");
		DocGenerator mac2=new DocGenerator(hpLaser,"Twin-Prime Conjecture");
		DocGenerator mac3=new DocGenerator(hpLaser,"Godel's Incompleteness Theorem");
		DocGenerator mac4=new DocGenerator(hpLaser,"Delayed Choice Quantum Eraser");
	}
}