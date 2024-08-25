import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite o número da Agência!");
		int agencia = scanner.nextInt();
		
		System.out.println("Por favor, digite o número da Conta!");
		int conta = scanner.nextInt();
		
		System.out.println("Por favor, digite o seu nome completo!");
		String nome = scanner.next();
		
		System.out.println("Por favor, digite o seu saldo!");
		double saldo = scanner.nextDouble();
		
		
		
		System.out.println("Olá " + nome +" ,obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + conta + " e o seu saldo é " + saldo + " para saque" );
		
	
	
	}  








}