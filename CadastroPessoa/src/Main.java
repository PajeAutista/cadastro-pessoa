public class Main

{
public static void main(String[] args)
	{



	Pessoa pessoa1 = new Pessoa(1, "Carol", 23, "Masculino");
	Endereco endereco1 = new Endereco(1, "Rua Adelino Vicente Melo", "Rio Grande", "Palho�a");
	
	
	
	Pessoa pessoa2 = new Pessoa(2, "Jo�o", 20, "Femenino");
	Endereco endereco2 = new Endereco(2, "Rua Genesio Francisco Martins", "Barra do Aririu", "Palho�a");
	
	pessoa2.setNome("Jos�");
	
	
	System.out.println("O nome da pessoa 1 � " + pessoa1.getNome() + ".");
	System.out.println("A idade da pessoa 1 � " + pessoa1.getIdade() + " anos.");
	System.out.println("A rua onde a pessoa 1 mora � " + endereco1.getRua() + ".");
	System.out.println("A Cidade onde a pessoa 1 mora � " + endereco1.getCidade() + ".\n");
	
	
	System.out.println("O nome da pessoa 2 � " + pessoa2.getNome() + ".");
	System.out.println("A idade da pessoa 2 � " + pessoa2.getIdade() + " anos.");
	System.out.println("A rua onde a pessoa 2 mora � " + endereco2.getRua() + ".");
	System.out.println("A Cidade onde a pessoa 2 mora � " + endereco2.getCidade() + ".");




	}
}