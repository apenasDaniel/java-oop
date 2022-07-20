
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("222.222.222-22");
		nico.setSalario(2600);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getCpf());
		System.out.println(nico.getSalario());
		
	}
	
}
