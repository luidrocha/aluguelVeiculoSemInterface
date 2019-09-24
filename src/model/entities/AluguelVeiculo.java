package model.entities;

import java.util.Date;

public class AluguelVeiculo {

	private Date inicioAlugel ;
	private Date fimAluguel;
	
	private Veiculo veiculo;
	private NotaPagamento notaPagamento;
	
	public AluguelVeiculo() {
		
	}

	public AluguelVeiculo(Date inicioAlugel, Date fimAluguel, Veiculo veiculo) {
		
		this.inicioAlugel = inicioAlugel;
		this.fimAluguel = fimAluguel;
		this.veiculo = veiculo;
		
	}

	public Date getInicioAlugel() {
		return inicioAlugel;
	}

	public void setInicioAlugel(Date inicioAlugel) {
		this.inicioAlugel = inicioAlugel;
	}

	public Date getFimAluguel() {
		return fimAluguel;
	}

	public void setFimAluguel(Date fimAluguel) {
		this.fimAluguel = fimAluguel;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public NotaPagamento getNotaPagamento() {
		return notaPagamento;
	}

	public void setNotaPagamento(NotaPagamento notaPagamento) {
		this.notaPagamento = notaPagamento;
	}
	
	
	
	
	
	
	
	
	
	
}
