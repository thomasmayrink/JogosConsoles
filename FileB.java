public class FileB {
	FileA fileA;
	int nome;

	public void methodX(int nome){
		fileA.setNome(nome);		
	}

	public void methodY(){
		FileA.open();
		FileA.getNome();
	}
}
