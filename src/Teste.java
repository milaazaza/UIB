
public class Teste {
	
	public static void main(String [] args) {
		
	
Cliente c = new Cliente();

	
c.nome = "camila";
c.cpf = "000000001111";

Conta conta = new Conta();
conta.saldo = 100;
conta.dono = "camila";

System.out.println(conta.saldo);




	
}
}