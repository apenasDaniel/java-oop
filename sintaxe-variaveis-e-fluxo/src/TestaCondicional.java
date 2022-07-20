
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("conditionals test");
		int idade = 16;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("you have more than 18 years old");
			System.out.println("welcome");

		} else {
			if (quantidadePessoas >= 2) {

				System.out.println("u dont have 18 but can enter cuz u have company");
			} else {
				System.out.println("f u cant participate");
			}
		}
	}
}