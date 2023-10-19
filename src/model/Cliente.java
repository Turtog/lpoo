package model;

public class Cliente implements Associado{

	private String nome;
	private int qdeCotas;
	private double valorCota;
	
	@Override
	public double lucros(int qdeCotas, double valorCota) {
		return 0;
	}

	@Override
	public String toString() {
		return "\nCliente [nome=" + nome + ", qdeCotas=" + qdeCotas + ", valorCota=" + valorCota + "]";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int getqdeCotas() {
		return this.qdeCotas;
	}

	@Override
	public void setqdeCotas(int qdeCotas) {
	
	}

	@Override
	public double getvalorCota(double valorCota) {
		return 0;
	}

	@Override
	public void setvalorCota(double valorCota) {
	}

	public Cliente(String nome, int qdeCotas, double valorCota) {
		super();
		this.nome = nome;
		this.qdeCotas = qdeCotas;
		this.valorCota = valorCota;
	}

	public Cliente() {
		super();
	}

}
