package encapsulation;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Baljeet");
		s1.setEmail("baljeet@gmail.com");
		s1.setPassword("12345");
		s1.setMobile("1456983210");
		s1.setDivision("A");
		s1.setStd("12");
		
		System.out.println(s1);
		System.out.println("Id: "+s1.getId()+"\nName: "+s1.getName()+"\nEmail: "+s1.getEmail()+"\nPassword:"+s1.getPassword()+"\nMobile:"+s1.getMobile()+"\nStd:"+s1.getStd()+"\nDivision:"+s1.getDivision());
		 
		//employee class with string method
		
		Employee e1= new Employee();
		e1.setId(1);
		e1.setName("Baljeet");
		e1.setEmail("baljeet@gmail.com");
		e1.setPassword("12345");
		e1.setMobile("5897453210");
		e1.setDesignation("Trainee");
		
		System.out.println(e1);
	}

}
