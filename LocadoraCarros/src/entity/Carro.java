package entity;

public class Carro {
	private int id;
	private int ano;
	private String nome;
	private String marca;
	private String cor;
	private Double ipva;
	private Double valor;

	public Carro(int id, int ano, String nome, String marca, String cor, Double ipva, Double valor) {
		this.id = id;
		this.ano = ano;
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.ipva = ipva;
		this.valor = valor;
	}

	public Carro(int id, int ano, String nome, String marca, String cor, Double ipva) {
		this.id = id;
		this.ano = ano;
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.ipva = ipva;
	}

	public Carro(int id, int ano, String nome, String marca, String cor) {
		this.id = id;
		this.ano = ano;
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;

	}

	public Carro(int id, int ano, String nome, String marca) {
		this.id = id;
		this.ano = ano;
		this.nome = nome;
		this.marca = marca;

	}

	public Carro(int id, int ano, String nome) {
		this.id = id;
		this.ano = ano;
		this.nome = nome;

	}
	public Carro(int id ,String nome) {
		this.id = id;
		this.nome = nome;

	}

	public Carro(int id, int ano) {
		this.id = id;
		this.ano = ano;

	}

	public Carro(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getIpva() {
		return ipva;
	}

	public void setIpva(Double ipva) {
		this.ipva = ipva;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
