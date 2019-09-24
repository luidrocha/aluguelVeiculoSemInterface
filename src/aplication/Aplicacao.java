package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelVeiculo;
import model.entities.Veiculo;
import model.services.AluguelServices;
import model.services.BrazilTaxService;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel: ");
		
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		
		System.out.print("Data e hora inicial (dd/MM/yyyy  HH/mm ): ");
		Date di = sdf.parse(sc.nextLine());
		
		System.out.print("Data e hora final  (dd/MM/yyyy  HH/mm ): ");
		Date df = sdf.parse(sc.nextLine());
		
		AluguelVeiculo alugado = new AluguelVeiculo(di, df, new Veiculo(modelo));
		
		// 
		
		System.out.print("Entre com o preço por hora: ");
		Double precoPorHora = sc.nextDouble();
		
		System.out.print("Entre com o preço por dia: ");
		Double precoPorDia = sc.nextDouble();
		
		
		
		// instancia o servico
		
		AluguelServices aluguelService = new AluguelServices(precoPorHora, precoPorDia,  new BrazilTaxService());
		
		// Processa a nota de pagamento
		aluguelService.processaNotaPagamento(alugado);
		
		System.out.println("Dados Pagamento: ");
		
		System.out.println("Pagamento Base: " + String.format("%.2f", alugado.getNotaPagamento().getValorCobrado()));
		System.out.println("Taxa: " + String.format("%.2f", alugado.getNotaPagamento().getTaxaCobrada()));
		System.out.println("Pagamento Total: " + String.format("%.2f", alugado.getNotaPagamento().getTotalPagamento()));
		
		
		
		

		
		sc.close();
	}

}
