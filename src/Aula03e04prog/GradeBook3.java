package Aula03e04prog;
//Declaracao de classe com uma variavel de instancia
// courseName e dois m�todos para configurar e obter seu valor

public class GradeBook3 {

	//Variavel de instancia que guarda o nome do curso
	private String courseName;
	
	//Metodo para configurar o nome do curso
	public void setCourseName(String name) {
		courseName = name; //armazena o nome do curso
	} //fim do metodo setCourseName
	
	//metodo para recuperar o nome do curso
	public String getCourseName() {
		return courseName;
	} //fim do metodo getCourseName

	// Exibe uma mensagem de boas-vindas ao usuario com o nome do curso
	public void displayMessage() {
		System.out.printf("Welcome to the Grade Book for \n%s!\n", getCourseName());
	}//fim do m�todo displayMessage
	
}//fim da classe GradeBook