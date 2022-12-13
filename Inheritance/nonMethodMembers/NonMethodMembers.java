/* In java, non-method members are accessed based on reference type,
not on object type...
*/

class Super{
	int num=89;
}

class Sub extends Super{
	int num =97;
}

class Driver{
	public static void main(String[] args) {
		Super ref1=new Super();//Reference is of Super type
		System.out.println(ref1.num);
		Super ref2=new Sub();//Reference is of Super type
		System.out.println(ref2.num);

		/*To access non-method members of sub class, we can typecast
		Super class reference to Sub class reference as follows:*/

		Super ref3=new Sub();
		System.out.println(((Sub)ref3).num);
	}
}