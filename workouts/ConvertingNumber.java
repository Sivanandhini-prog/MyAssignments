package week1.workouts;

public class ConvertingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int s=-17;
      int l;
       if(s<=0) {
    	   System.out.println("The number is negative number");
       }
       else if(s==0) {
    	   System.out.println("The number is Zero");
       }
       else {
    	   System.out.println("The number is Positive number");
       }
       l=s*-1;
       System.out.println("Changing into positive number"+ l);
	}

}
