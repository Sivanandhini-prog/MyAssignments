package week1.workouts;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int n1=0,n2=1,sum=0;
		System.out.println(n1);
		System.out.println(n2);
		for (int i=1;i<=11;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
		}
		
		
	
	}

}
