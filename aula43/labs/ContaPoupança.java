package com.valerio.cursojava.aula43.labs;

public class ContaPoupan�a extends ContaBancaria {
	private double diaRendimento;

	public double getSaldo() {
		return super.getSaldo();
	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public double atualizarSaldo(double taxa) {
		taxa = taxa / 100;
		this.setDiaRendimento(super.getSaldo() * taxa);
		super.setSaldo(super.getSaldo() + getDiaRendimento());
		return super.getSaldo();
	}

	public String toString() {
		String description = "\nNome: " + super.getNome();
		description += "\nN�mero da Conta: " + super.getConta();
		description += "\nSaldo: R$" + super.getSaldo();
		description += "\nRendimento Di�rio: R$" + diaRendimento;
		return description;
	}
}
