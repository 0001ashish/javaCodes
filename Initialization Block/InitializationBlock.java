class Booker{
	synchronized void book(int seats)
		{	
			if(seats > PVR.seat){
				System.out.println("Insufficient Seats...");
			}
			else{	
				System.out.println("Congratulations !! "+seats+" Tickets are booked...");
				PVR.seat = PVR.seat - seats;
				System.out.println(PVR.seat);
			}
		}
}

class PVR extends Thread
{
	static int seat = 10;
	int demandSeat;
	Booker ref;
	PVR(Booker ref,int d)
	{
	this.ref=ref;
	demandSeat = d;
	}

public void run()
	{
	ref.book(demandSeat);
	}
}
class Driver
{
	public static void main(String args[])
	{
	Booker book=new Booker();
	PVR p1 = new PVR(book,4);
	PVR p2 = new PVR(book,6);
	PVR p3 = new PVR(book,5);
	p1.start();
	p2.start();
	p3.start();
	}
}