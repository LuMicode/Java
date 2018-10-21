public class Timetest{
	public static void main(String[] args){
		Time theTime = new Time(12,11,0);
		System.out.println(theTime.toString());
		theTime.increment(10);
		System.out.println(theTime.toString());
		theTime.increment(30);
		System.out.println(theTime.toString());
		theTime.increment(40);
		System.out.println(theTime.toString());
	}
}


