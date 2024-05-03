package hotel;

public class Quartos {
	//atributos
	private String num_quarto;
	private boolean ocupado;
	private boolean estado;
	private EstadoChave estadoChave;


	//construtor
	public Quartos() {

	}
	public Quartos(String num_quarto, boolean ocupado, boolean estado) {
	this.num_quarto=num_quarto;
	this.ocupado=ocupado;
	this.estado=estado;
	}
	public Quartos(String num_quarto, boolean ocupado, boolean estado, EstadoChave estadoChave) {
	this.num_quarto=num_quarto;
	this.ocupado=ocupado;
	this.estado=estado;
	this.estadoChave=estadoChave.Disponivel;
	}

	//get
	public String getNum_quarto() {
	return num_quarto;
	}
	public boolean getOcupado() {
	return ocupado;
	}
	public boolean getEstado() {
	return estado;
	}
	public EstadoChave getEstadoChave() {
	return estadoChave;
	}
	
	//set
	public void setNum_quarto(String num_quarto) {
	this.num_quarto=num_quarto;
	}
	public void setOcupado(boolean ocupado) {
	this.ocupado=ocupado;
	}
	public void setEstado(boolean estado) {
	this.estado=estado;
	}
	public void setEstadoChave(EstadoChave estadoChave) {
	this.estadoChave=estadoChave;
	}
	public void setHospede(Hospedes nome) {
		// TODO Auto-generated method stub
		
	}
}
