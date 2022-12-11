class Math{
	int num;
	Math(int num){this.num=num;}

	class Square{
		public int square(){
			return num*num;
		}
	}
}

class Driver{
	public static void main(String[] args) {
		Math ref1=new Math(25);
		Math.Square ref2=ref1.new Square();
	int a=ref2.square();
	System.out.println(a);
	}
}