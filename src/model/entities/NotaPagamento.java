package model.entities;



public class NotaPagamento {

	private Double valorBasico;
	private Double taxaCobrada;
	
	public NotaPagamento() {
		
	}
	
	public NotaPagamento(double valor, Double taxa) {
		
		this.valorBasico = valor;
		this.taxaCobrada = taxa;
	}
	
	public Double getValorCobrado() {
		
		return valorBasico;
	}
	
	public void setValorCobrado(Double valor) {
		
		this.valorBasico = valor;
	}
	
	public Double getTaxaCobrada() {
		
		return this.taxaCobrada;
	}
	
	public Double getTotalPagamento() {
		
		return getValorCobrado()+ getTaxaCobrada();
	}
	
	
}
