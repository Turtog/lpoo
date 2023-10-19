package model;

public class ContaC extends Conta implements Associado{

	private int qdeCotas;
	private double valorCota;

	@Override
	public double lucros(int qdeCotas, double valorCota) {
		this.qdeCotas = qdeCotas;
		this.valorCota = valorCota;
		return 0;
	}	

	@Override
	public String toString() {
		return "\nContaC [qdeCotas=" + qdeCotas + ", valorCota=" + valorCota + ", saldo=" + super.saldo + "]";
	}



	@Override
	public int getqdeCotas() {
		return this.qdeCotas;
	}

	@Override
	public void setqdeCotas(int qdeCotas) {
		this.qdeCotas = qdeCotas;
	}

	@Override
	public double getvalorCota(double valorCota) {
		return 0;
	}

	@Override
	public void setvalorCota(double valorCota) {

	}
	
}
