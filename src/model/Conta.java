package model;

public abstract class Conta {
		
		protected double saldo;
		public void deposita(double valor) {
			saldo += saldo;
		}
		public void saca(double valor) {
			double saldoAtual = saldo - valor;
			if(saldoAtual>=0) {
				saldo -= valor;
			}
			else {
				System.out.println("Não foi possivel realizar o saque.");
			}
		}
		public void atualiza(double taxa) {
			if(taxa>0) {
				saldo += saldo * (taxa/100);
			}
			else {
				System.out.println("A taxa deve ser maior que ZERO");
			}
		}
	
		public Conta(double saldo) {
			super();
			this.saldo = saldo;
		}
		public Conta() {
			super();
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		@Override
		public String toString() {
			return "\nConta [saldo=" + saldo + "]";
		}

}
