// gerente é um funcionario, gerente herda da class funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonifcação do Designer");
		return 200;
	}
	

}
