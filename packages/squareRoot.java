import Roots.*;
//import java.time.Duration;
class Driver{
	public static void main(String[] args) {
		long start,end;
		start=System.nanoTime();
		double num=Bisection.squareRoot(1234567891);
		end=System.nanoTime();
		long duration=end-start;
		System.out.println(duration);
		System.out.println(num);

		start=System.nanoTime();
		num=NewtonRaphson.squareRoot(1234567891);
		end=System.nanoTime();

		duration=end-start;
		System.out.println(duration);
		System.out.println(num);

	}
}