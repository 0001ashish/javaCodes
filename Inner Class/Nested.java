class Math{
	int num;
	Math(int num){this.num=num;}

	double squareRoot(){
		double d=(double)num; 


	}
	class Square{
		public int square(){
			return num*num;
		}
	}
}

class Driver{
	public static void main(String[] args) {
		Math.Square ref=new Math(46).new Square();
	int a=ref.square();
	System.out.println(ref.square());
	}
}