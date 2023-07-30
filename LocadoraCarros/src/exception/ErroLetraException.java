package exception;

@SuppressWarnings("serial")
public class ErroLetraException extends RuntimeException{
	
	public ErroLetraException() {
		System.out.println("Você digitou caracter. É necessário digitar apenas números. ");
	}
	
}
