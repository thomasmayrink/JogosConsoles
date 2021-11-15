public class FileA {
	int nome;
	int idade;
	int pontos;
	float valor;
	
	public void open(){
	}

	public void setNome(int nome){
		if (nome > 0) {
			this.nome = nome;
		}
	}

	public int getNome() {
		return this.nome;
	}
}
