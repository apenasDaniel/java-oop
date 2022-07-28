// gerente é um funcionario, gerente herda da class funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonifcação do Editor de Vídeo");
		return super.getBonificacao() + 100;
	}
	

}
