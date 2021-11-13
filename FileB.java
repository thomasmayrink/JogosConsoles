public class FileB {
	FileA fileA;
	int nome;

	public void methodX(int nome){
		fileA.setName(nome);		
	}

	public void methodY(){
		FileA.open();	
	}
}
