
public class ExecutaSQL {

	public static void main(String[] args) {
		BancoDados sintaxeBanco = new BancoDados();
		sintaxeBanco.conectar();

		if(sintaxeBanco.estaConectado()) {
			
			sintaxeBanco.listaProdutos();

			System.out.println("Banco conectado");
		}else {
			System.out.println("Não foi possível conectar ao banco");
		}

	}

}
