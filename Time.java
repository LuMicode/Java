public class Time{
	private int hours, minutes, seconds;

	Time(){
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	Time(int h, int m, int s){
		if(h < 0 || h > 23)
			hours = 0;
		else
			hours = h;
		if(m < 0 || m > 60)
			minutes = 0;
		else
			minutes = m;
		if(s < 0 || s > 60)
			seconds = 0;
		else
			seconds = s;
	}
	
	Time(int h, int m){
		hours = h;
		minutes = m;
		seconds = 0;
	}
	
	public String toString(){
		return "Hours " + hours + "\n" +
			"Minutes: " + minutes + "\n" +
			"Seconds: " + seconds;
	}
	
	public void increment(int amount){
		minutes += amount;
		if(minutes > 59){
			++hours;
			minutes -= 60;
		}
	}
	 
} 	
