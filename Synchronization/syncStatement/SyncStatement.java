class Printer{
	public void genPrint(String content){
		System.out.print("[ ");
		try{
			Thread.sleep(1000);
			System.out.print(content);
			System.out.println(" ]");
		}catch(InterruptedException e){e.printStackTrace();}
		
	}
}
 
class DocGenerator implements Runnable{
	Printer hpLaser;
	String content;

	DocGenerator(Printer ref,String content){
		hpLaser=ref;
		this.content=content;
		Thread t=new Thread(this);
		t.start();
	}

	public void run(){
		synchronized(hpLaser){
			hpLaser.genPrint(content); 
		}
	}
}

class Driver{
	public static void main(String[] args) {
		Printer hpLaser=new Printer();
		DocGenerator mac1=new DocGenerator(hpLaser,"Young's Double Slit Experiment");
		DocGenerator mac2=new DocGenerator(hpLaser,"Quantum Entanglement");
		DocGenerator mac3=new DocGenerator(hpLaser,"Uncertainty Principle");
		DocGenerator mac4=new DocGenerator(hpLaser,"Quantum Spin");
		DocGenerator mac5=new DocGenerator(hpLaser,"Gravitational Waves");
		DocGenerator mac6=new DocGenerator(hpLaser,"Quantum Gravity");
	}
}