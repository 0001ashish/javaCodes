package Roots;

import static java.lang.Math.*;
public class NewtonRaphson{
	public static double squareRoot(int n){

		if(n==0){
			return 0;
		}

		if(n<0){
			return -1;
		}
		double num=(double)n;
		double x=num;

		double fun=num*num;
		double der=2*num;

		double precision=0.00000001;
		int ctr=0;
		while(abs(fun)>precision){
			x=x-(fun/der);
			fun=x*x-num;
			der=2*x; 
			ctr++;
		}
		System.out.println("Steps: "+ctr);
		return x;
	}
}
