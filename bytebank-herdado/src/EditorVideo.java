// gerente � um funcionario, gerente herda da class funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifca��o do Editor de V�deo");
		return super.getBonificacao() + 100;
	}
	

}
