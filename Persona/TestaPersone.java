public class TestaPersone{
	public static void main(String args[]){
		Persona p1, p2;
		
		p1 = new Persona("giulio", 17);
		p2 = new Persona("jacopo", 18);
		
		if(p1.getEta() > p2.getEta())
			System.out.println("La persona piu' vecchia e' " + p1.getNome());
		else
			System.out.println("La persona piu' vecchia e' " + p2.getNome());
		
	}
	
}