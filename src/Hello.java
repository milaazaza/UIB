import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("digite seu nome");
		
		String nome = sc.next();
		
		System.out.println(nome);
		
		sc.close();

	}

}
