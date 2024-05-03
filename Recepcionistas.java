
	//verifica ocupação do quarto
	public void VerificarOcupacao(Quartos quartos) {
		if(quartos.getOcupado()) {
			System.out.println(getNum_quarto()+"Quarto ocupado!");
		} else {
			System.out.println(getNum_quarto() + "Quarto desocupado");
		}
	}
	//verifica se esta limpo ou não
	public void VerifcarLimpo(Quartos quartos) {
		if(quartos.getEstado() == true) {
			System.out.println(getNum_quartos()+"Está Limpo!");
		} else {
			System.out.println("Não está Limpo!");
		}
	}
	
	//alocar quarto
		public void Alocar(Quartos estado, Hospedes nome, Quartos ocupado, Quartos num_quarto) {
			if(!ocupado.getOcupado() && estado.getEstado()) {
				ocupado.setHospede(nome);
				ocupado.setOcupado(true);
				estado.setEstado(false);
				
				System.out.println(" hospede " + nome.getNome()+" alugou quarto " + num_quarto.getNum_quarto());
				} else {
					System.out.println("Não pode alugar!");
				}
	}
	
	private char[] getNum_quartos() {
		// TODO Auto-generated method stub
		return null;
	}
	private String getNum_quarto() {
		// TODO Auto-generated method stub
		return null;
	}
