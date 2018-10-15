public class Person{
	private String first;
	private String middle;
	private String last;

	//constructors
	public Person(String f, String m, String l){
		first = f;
		middle = m;
		last = l;
	}

	public Person(String f, String l){
		first = f;
		middle = "";
		last = l;
	}

	public Person(String f){
		first = f;
		middle = "";
		last = "";
	}

	public Person(){
		first = "";
		middle = "";
		last = "";
	}

	public String toString(){
		return first +  " " + middle + " " + last;
	}

	public String getFirst(){
		return first;
	}
	
	public String getMiddle(){
		return middle;
	}
	
	public String getLast(){	
		return last;
	}

	public void setFirst(String fname){	
		first = fname;
	}
	
	public void setMiddle(String mname){
		middle = mname;
	}
		
	public void setlast(String lname){
		last = lname;
	}

	public void setName(String f, String m, String l){
		first = f;
		middle = m;
		last = l;
	}
 
}	
