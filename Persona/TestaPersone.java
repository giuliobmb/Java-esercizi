public class TestaPersone{
	public static void main(String args[]){
		Persona p1, p2;
		
		p1 = new Persona("giulio", 17);
		p2 = new Persona("jacopo", 18);
		
		if(p1.getEta() > p2.getEta())
			System.out.println("ciao");
		else
			System.out.println("ciao");
		
	}
	
}