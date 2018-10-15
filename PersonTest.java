public class PersonTest{
	public static void main(String[] args){
		Person myname = new Person("Malith","Bandara");
		Person yourname = new Person("Nandun","Thilina","Bandara");
		Person blankname = new Person();
			
		System.out.println("myname = " + myname.toString());
		System.out.println("yourname =  " + yourname.toString());

		System.out.println("myname first name= " + myname.getFirst());
		yourname.setlast("Brown");
		System.out.println("Your name = " + yourname.toString());
					
		blankname.setName("Senidu","D","Mendis");
		System.out.println("blank name = " + blankname.toString());
		
		System.out.println("blank name last name = " + blankname.getLast());

	}
}
