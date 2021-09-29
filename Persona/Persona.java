public class Persona{
	
	//attributi
	private String nome;
	private int eta;
	
	//costruttori
	Persona(){
		nome = "";
		eta = 0;
	}
	Persona(String nome, int eta){
		this.nome = nome;
		this.eta = eta;
	}
	
	//getter setter
	
	public String getNome(){
		return nome;
	}
	public int getEta(){
		return eta;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setEta(int eta){
		this.eta = eta;
	}
	
	
}