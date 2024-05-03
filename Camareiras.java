package hotel;

public class Camareiras extends Thread {
	//atributos
	private String nome;
	private boolean limpando;
	
	//construtor
	public Camareiras() {
		
	}
	public Camareiras(String nome, boolean limpando) {
		this.nome=nome;
		this.limpando=limpando;
	}
	public void run() {
		//so se o quartor estiver vago ou chave na recepção
	}

	//get e set
	public String getNome() {
		return nome;
	}
	public boolean getLimpando() {
		return limpando;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setLimpando(boolean limpando) {
		this.limpando=limpando;
	}
}
