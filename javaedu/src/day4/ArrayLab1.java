package day4;

public class ArrayLab1 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		for(int i=0; i<ary.length; i++) {
			if(i == ary.length-1)
				System.out.println(ary[i]);
			else				
			System.out.print(ary[i]+" ");
		}
		ary = new int[]{10,20,30,40,50,60,70,80,90,100};
		System.out.printf("첫 번째 : %d\n마지막 : %d\n합 : %d\n",ary[0],ary[ary.length-1],(ary[0]+ary[ary.length-1]));		
		for(int elem : ary)
			System.out.printf("%s",(elem==ary[ary.length-1])?elem+"\n":elem+" ");
		for(int i=ary.length-1; i>=0; i--)
			System.out.printf("%s",(i == 0)?ary[i]+"\n":ary[i]+" ");
		for(int i=1; i<=ary.length; i+=2)
			System.out.printf("%s",(i == ary[ary.length-1])?ary[i]+"\n":ary[i]+" ");
		
	}

}
