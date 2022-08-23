
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) throws Exception {

		
		Conta c = new Conta();
		
		try {
			c.deposita();
		} catch(MinhaExcecao ex) {
			System.out.println("tratamento da exceção");
		}
	
	}

}
