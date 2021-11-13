public class FileA {
	int nome;
	
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
