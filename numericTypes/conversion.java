class Driver{
	public static void main(String[] args) {
		/*Following are the premitive data types:
								
								  char
								   |
			 byte ___> short ___> int ___> long...
								  : |  ......:   :
								  : |__:___	     :
			 				   	  :	   :   |     :
							  float<...: double<.:
	*/
		//If either of the operands is double, other will be converted to double
		//Otherwise, if either of the operands is float, the other one will be converted to float
		//Otherwise, if either of the operands is long, the other one will be converted to long
		//Otherwise, both operands will be converted to int

		int operand11=100;
		double operand12=98.76;
		double result1=operand11+operand12;//Try changing type of result1
		System.out.println(result1);

		char operand21='a';
		float operand22=186.667f;
		double result2=operand21+operand22;//Try changing type of 
		System.out.println(result2);

		float operand31=100.100f;
		double operand32=200.200;
		double result3=operand31+operand32;
		System.out.println(result3);

		short operand41=10;
		char operand42='a';
		Object result4=operand41+operand42;
		System.out.println(result4) ;
		System.out.println(result4.getClass().getName());
	}
}