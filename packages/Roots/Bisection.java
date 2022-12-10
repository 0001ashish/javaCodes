package Roots;

import static java.lang.Math.*;
public class Bisection{

	public static double squareRoot(int n){

		if(n==0){
			return 0;
		}

		if(n<0){
			return -1;
		}
		double num=(double)n;
		double upperBound=num;
		double lowerBound=0;

		double precision=0.00000001;

		double mid=(lowerBound+upperBound)/2;
		double guess=mid*mid;
		int ctr=0;
		while(abs(guess-n)>precision){
			if(guess>n){
				upperBound=mid;
			}
			else{
				lowerBound=mid;
			}

			mid=(lowerBound+upperBound)/2;
			guess=mid*mid;
			ctr++;
		}
		System.out.println("Steps: "+ctr);
		return mid;
	}

}
