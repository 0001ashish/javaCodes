class Helper{
	public static void multiply(int[][] ref1,int[][] ref2,int[][] result){
		for(int i=0;i<ref1[0].length;i++){
			for(int j=0;j<ref2.length;j++){
				for(int k=0;k<ref1[0].length;k++){
					result[i][j]=result[i][j]+ref1[i][k]*ref2[k][j];
				}
			}
		}
	}

	public static void display(int[][] ref){
		for(int i=0;i<ref.length;i++){
			for(int j=0;j<ref[0].length;j++){
				System.out.print(ref[i][j]+"   ");
			}
			System.out.println("");
			System.out.println("");
		}
	}
}

class Driver{
	public static void main(String[] args) {
		int[][] arr1=new int[3][3];
		int[][] arr2=new int[3][3];
		int[][] result=new int[3][3];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr1[i][j]=i+j;
				arr2[i][j]=i+j;
			}
		}
	}
}