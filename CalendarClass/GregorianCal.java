class A{
	int a;
	int c;
	A(){
		this(46);
		c=20;
	}
	A(int b){
		a=b;
	}
}

class Main{
	public static void main(String[] args) {
		A obj=new A();
		System.out.println(obj.a);
		System.out.println(obj.c);
	}
}