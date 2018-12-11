public class calcu{
	private double number;
		
	calcu(double n){
		number  = n;
	}

	public void add(double n){
		number += n;
	}

	public void sub(double n){
		number -= n;
	}
		
	public void mul(double n){
		number *= n;
	}
	
	public void div(double n){
		number /= n;
	}
	
	public double show(){
		return number;
	}
}
		
		
