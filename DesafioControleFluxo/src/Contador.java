import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Enter the first parameter");
		int firstNum = terminal.nextInt();
		
		System.out.println("Enter the second parameter");
		int secondNum = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(firstNum, secondNum);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("The first parameter must not be greater than the second!");
		}
		
	}
	static void contar(int firstNum, int secondNum ) throws ParametrosInvalidosException {
		if (firstNum > secondNum) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = secondNum - firstNum;
		
		for(int i = 0; i < contagem; i++){
			System.out.println("printing number "+ (i+1));
		}
	}
}