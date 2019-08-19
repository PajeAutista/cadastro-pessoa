public class Pessoa 
{

private Integer id;
private String nome;
private Integer idade;
private String sexo;

public Pessoa() {
super();

}


public Pessoa(Integer id, String nome, Integer idade, String sexo) {
super();
this.id = id;
this.nome = nome;
this.idade = idade;
this.sexo = sexo;
}


public Integer getId() {
return id;
}
	public void setId(Integer id) {
	this.id = id;
	}
public String getNome() {
return nome;
}
	public void setNome(String nome) {
	this.nome = nome;
	}
public Integer getIdade() {
return idade;
}
	public void setIdade(Integer idade) {
	this.idade = idade;
	}
public String getSexo() {
return sexo;
}
	public void setSexo(String sexo) {
	this.sexo = sexo;
	}

}