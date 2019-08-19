public class Main

{
public static void main(String[] args)
	{



	Pessoa pessoa1 = new Pessoa(1, "Carol", 23, "Masculino");
	Endereco endereco1 = new Endereco(1, "Rua Adelino Vicente Melo", "Rio Grande", "Palhoça");
	
	
	
	Pessoa pessoa2 = new Pessoa(2, "João", 20, "Femenino");
	Endereco endereco2 = new Endereco(2, "Rua Genesio Francisco Martins", "Barra do Aririu", "Palhoça");
	
	pessoa2.setNome("José");
	
	
	System.out.println("O nome da pessoa 1 é " + pessoa1.getNome() + ".");
	System.out.println("A idade da pessoa 1 é " + pessoa1.getIdade() + " anos.");
	System.out.println("A rua onde a pessoa 1 mora é " + endereco1.getRua() + ".");
	System.out.println("A Cidade onde a pessoa 1 mora é " + endereco1.getCidade() + ".\n");
	
	
	System.out.println("O nome da pessoa 2 é " + pessoa2.getNome() + ".");
	System.out.println("A idade da pessoa 2 é " + pessoa2.getIdade() + " anos.");
	System.out.println("A rua onde a pessoa 2 mora é " + endereco2.getRua() + ".");
	System.out.println("A Cidade onde a pessoa 2 mora é " + endereco2.getCidade() + ".");




	}
}