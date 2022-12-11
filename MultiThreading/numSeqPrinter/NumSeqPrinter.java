import java.util.*;
class numPrinter{
    public void printer(int num,int thrNum){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+": "+(num+thrNum*i));
        }
    }
}

class EvenOdd implements Runnable{
    int num;
    int thrNum;
    private static numPrinter ref=new numPrinter();
    EvenOdd(int num,int thrNum){
        this.num=num;
        this.thrNum=thrNum;
        Thread t=new Thread(this);
        t.start();
    }

    public void run(){
        ref.printer(num,thrNum);
    }
}

class Driver{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting number of sequence:");
        int num=sc.nextInt();
        System.out.print("Enter the number of threads:");
        int thrNum=sc.nextInt();

        EvenOdd[] ref=new EvenOdd[thrNum];
        for(int i=0;i<thrNum;i++){ref[i]=new EvenOdd(num+i,thrNum);}
   }
}