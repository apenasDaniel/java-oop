// gerente � um funcionario, gerente herda da class funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifca��o do Designer");
		return 200;
	}
	

}
