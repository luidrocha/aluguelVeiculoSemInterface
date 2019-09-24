package model.services;

import model.entities.AluguelVeiculo;
import model.entities.NotaPagamento;

public class AluguelServices {

	private Double precoPorDia;
	private Double precoPorHora;
	private BrazilTaxService taxService;

	public AluguelServices(Double precoPorHora, Double precoPorDia, BrazilTaxService taxService) {

		
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxService = taxService;
		
	}

	public void processaNotaPagamento(AluguelVeiculo carroAlugado) {
		// transforma a hora para milessegundo
		long hi = carroAlugado.getInicioAlugel().getTime();
		long hf = carroAlugado.getFimAluguel().getTime();
		// Converte segundo / minutos / horas, resultado quebrado (double)
		
		
		
		double horas = (double) (hf - hi) / 1000 / 60 / 60;
		
		
		double valorBasico;
		
		if (horas <= 12.0) {
			
			
			// funcao Math.ceil arredonda pra cima as horas.
		valorBasico = Math.ceil(horas) * precoPorHora;
		} else {
			
			// horas/24 acha a quantidade de DIAS. 
			valorBasico = Math.ceil(horas/24) * precoPorDia;
			
		}
		
		// chama o serviço taxService
		double tax = taxService.Tax(valorBasico);
		
				
		carroAlugado.setNotaPagamento(new NotaPagamento(valorBasico, tax));
	}

}
