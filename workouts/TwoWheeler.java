package week1.workouts;

public class TwoWheeler {
	
	int noOfWheels=2;
	short noOfMirrors=1;
	long chassisNumber=7889987576l;
	boolean isPunctured=true;
	String bikeName= "Apache";
	double runningKM=39.4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TwoWheeler tw=new TwoWheeler();
        System.out.println(tw.noOfMirrors);
        System.out.println(tw.bikeName);
        System.out.println(tw.chassisNumber);
        System.out.println(tw.bikeName);
        System.out.println(tw.isPunctured);
        System.out.println(tw.runningKM);
	}

}
